package com.stpl.trainee.aman.assignment6.studentrepository.view;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.stpl.trainee.aman.assignment6.studentrepository.bean.StudentBean;
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
import com.vaadin.ui.Table;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

public class ShowStudentView extends VerticalLayout implements View {
	private static final long serialVersionUID = 1L;
	
	private int id;
	private transient Logger logger = LogManager.getLogger(RemoveStudentView.class);
	private transient StudentBean showStudentBean = new StudentBean();
	private transient NotificationViewer notificationViewer = new NotificationViewer();
	
	public ShowStudentView() {
		this.addStyleName("desktop");
		
		Panel showStudentPanel = new Panel("<center>Show Student</center>");
		showStudentPanel.setSizeUndefined();
		addComponent(showStudentPanel);
		
		FormLayout showStudentFormLayout = new FormLayout();

		final TextField idField = new TextField("ID");
		idField.setInputPrompt("Enter id");
		idField.setImmediate(true);
		showStudentFormLayout.addComponent(idField);

		Button showStudentButton = new Button("Show Student", new Button.ClickListener() {
			private static final long serialVersionUID = 6939491545171267736L;
			@Override
			public void buttonClick(ClickEvent clickEvent) {
				
				try {
					id = Integer.parseInt(idField.getValue());
					showStudentBean = showById();
					
					if (showStudentBean != null) {
						showInTable();
					} else {
						notificationViewer.getNotification("No such student record is available !!!");
					}
					
				} catch (NullPointerException nullPointerException) {
					notificationViewer.getNotification("Null Pointer Exception has been occured !!!");
					logger.info(nullPointerException + " : Not Found.");
				}
			}
		});

		Button backButton = new Button("Back To Homepage", new Button.ClickListener() {
			private static final long serialVersionUID = 6939491545171267736L;
			@Override
			public void buttonClick(ClickEvent clickEvent) {
				getUI().getNavigator().navigateTo(MyUi.MAINVIEW);
			}
		});

		showStudentFormLayout.addComponent(showStudentButton);
		showStudentFormLayout.addComponent(backButton);
		showStudentPanel.setContent(showStudentFormLayout);
		setSizeFull();
		setComponentAlignment(showStudentPanel, Alignment.MIDDLE_CENTER);
	}
	
	//Method which calls the show student service
	public StudentBean showById() {
		StudentBean studentBean = new StudentBean();
		studentBean.setId(id);
		
		ShowStudentService showStudentService = new ShowStudentService();
		return showStudentService.showStudentService(studentBean);

	}
	
	//Method to show details in a table
	public void showInTable() {
		
		Table studentTable = new Table("Student Details");
		studentTable.addContainerProperty("ID", Integer.class, null);
		studentTable.addContainerProperty("Name", String.class, null);
		studentTable.addContainerProperty("Age", Integer.class, null);
		studentTable.addContainerProperty("Course", String.class, null);
		studentTable.addContainerProperty("Address", String.class, null);
		studentTable.addContainerProperty("Contact", String.class, null);
		
		studentTable.addItem(new Object[] { showStudentBean.getId(), showStudentBean.getName(),
				showStudentBean.getAge(), showStudentBean.getCourse(), showStudentBean.getAddress(),
				showStudentBean.getContact() }, 1);
		
		studentTable.setPageLength(studentTable.size());
		addComponent(studentTable);
		setComponentAlignment(studentTable, Alignment.MIDDLE_CENTER);
	}
	
	@Override
	public void enter(ViewChangeEvent event) {
		// Auto-generated method stub
	}

}
