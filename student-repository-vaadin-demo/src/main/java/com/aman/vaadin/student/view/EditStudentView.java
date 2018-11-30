package com.aman.vaadin.student.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import lombok.Getter;
import lombok.Setter;

import com.stpl.trainee.aman.assignment6.studentrepository.bean.StudentBean;
import com.stpl.trainee.aman.assignment6.studentrepository.executor.CommandExecutor;
import com.stpl.trainee.aman.assignment6.studentrepository.service.ShowStudentService;
import com.stpl.trainee.aman.assignment6.studentrepository.ui.MyUi;
import com.stpl.trainee.aman.assignment6.studentrepository.ui.NotificationViewer;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@Getter
@Setter
public class EditStudentView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;
	
	private int searchId;
	private int id;
	private String name;
	private int age;
	private String course;
	private String address;
	private String contact;
	
	private TextField idField;
	private TextField nameField;
	private TextField genderField;
	private TextField courseField;
	private TextField emailField;
	private TextField phoneField;
	private TextField usernamField;
	private TextField passworField;

	public EditStudentView() {

		this.addStyleName("desktop");
		
		Panel editStudentPanel = new Panel("<center>Edit Student</center>");
		editStudentPanel.setWidth("350px");
		editStudentPanel.addStyleName("test");
		addComponent(editStudentPanel);
		
		FormLayout editStudentFormLayout = new FormLayout();

		final TextField searchIdField = new TextField("ID");
		searchIdField.setInputPrompt("Enter id");
		searchIdField.setImmediate(true);
		editStudentFormLayout.addComponent(searchIdField);

		Button searchStudentButton = new Button("Search Student", new Button.ClickListener() {
			private static final long serialVersionUID = 6939491545171267736L;
			@Override
			public void buttonClick(ClickEvent clickEvent) {
				searchId = Integer.parseInt(searchIdField.getValue());
				editStudentBean = editById();
				if (editStudentBean != null) {
					editStudentForm();
				} else {
					notificationViewer.getNotification("No such student record is available !!!");
				}
			}
		});

		Button backButton = new Button("Back To Homepage", new Button.ClickListener() {
			private static final long serialVersionUID = 3662128559717901900L;
			@Override
			public void buttonClick(ClickEvent clickEvent) {
				getUI().getNavigator().navigateTo(MyUi.MAINVIEW);
			}
		});
		
		editStudentFormLayout.addComponent(searchStudentButton);
		editStudentFormLayout.addComponent(backButton);
		editStudentPanel.setContent(editStudentFormLayout);
		setSizeFull();
		setComponentAlignment(editStudentPanel, Alignment.MIDDLE_CENTER);

	}
	
	//Method which calls update service using search id
	public StudentBean editById() {
		
		StudentBean searchBean = new StudentBean();
		searchBean.setId(searchId);
		ShowStudentService showStudentService = new ShowStudentService();
		return showStudentService.showStudentService(searchBean);

	}
	
	//Method to add records to bean
	public boolean addToBean() {
		StudentBean studentBean = new StudentBean();
		
		studentBean.setId(id);
		studentBean.setName(name);
		studentBean.setAge(age);
		studentBean.setCourse(course);
		studentBean.setAddress(address);
		studentBean.setContact(contact);
		
		CommandExecutor commandExecutor = new CommandExecutor();
		return commandExecutor.executeCommand("EDIT", studentBean);
	}
	
	//Method to create update student details form
	public void editStudentForm() {
		
		Panel editDetailsPanel = new Panel("<center>Edit Student Form</center>");
		editDetailsPanel.setSizeUndefined();
		addComponent(editDetailsPanel);
		
		editDetailsFormLayout = new FormLayout();
		
		idField = new TextField("ID");
		Integer editId = Integer.valueOf(editStudentBean.getId());
		idField.setValue(editId.toString());
		idField.setImmediate(true);
		editDetailsFormLayout.addComponent(idField);
		
		nameField = new TextField("Name");
		nameField.setValue(editStudentBean.getName());
		nameField.setImmediate(true);
		editDetailsFormLayout.addComponent(nameField);
		
		ageField = new TextField("Age");
		Integer editAge = Integer.valueOf(editStudentBean.getAge());
		ageField.setValue(editAge.toString());
		ageField.setImmediate(true);
		editDetailsFormLayout.addComponent(ageField);
		
		courseField = new TextField("Course");
		courseField.setValue(editStudentBean.getCourse());
		courseField.setImmediate(true);
		editDetailsFormLayout.addComponent(courseField);
		
		addressField = new TextField("Address");
		addressField.setValue(editStudentBean.getAddress());
		addressField.setImmediate(true);
		editDetailsFormLayout.addComponent(addressField);
		
		contactField = new TextField("Contact");
		contactField.setValue(editStudentBean.getContact());
		contactField.setImmediate(true);
		editDetailsFormLayout.addComponent(contactField);
		
		updateButton();
		
		editDetailsPanel.setContent(editDetailsFormLayout);
		setSizeFull();
		setComponentAlignment(editDetailsPanel, Alignment.MIDDLE_CENTER);
	}
	
	//Method to create update button
	public void updateButton() {
		
		Button editStudentButton = new Button("Edit Student", new Button.ClickListener() {
			private static final long serialVersionUID = -3512685473905303399L;
			@Override
			public void buttonClick(ClickEvent editButtonClickEvent) {
				callUpdate();
			}
		});		
		editDetailsFormLayout.addComponent(editStudentButton);
	}
	
	//Method which receives updated values from text fields
	public void callUpdate() {
		try {
			
			id = Integer.parseInt(idField.getValue());
			name = nameField.getValue();
			age = Integer.parseInt(ageField.getValue());
			course = courseField.getValue();
			address = addressField.getValue();
			contact = contactField.getValue();
			
			if (addToBean()) {
				notificationViewer.getNotification("Student Updated Successfully !!!");
			} else {
				notificationViewer.getNotification("Student updation failed !!!");
			}
			
		} catch (NullPointerException | NumberFormatException exception) {
			notificationViewer.getNotification("Please enter appropriate value !!!");
			logger.info(exception + " : Please enter appropriate value.");
		}
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// Do Something
	}

}
