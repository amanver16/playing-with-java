package com.aman.vaadin.student.view;

import com.aman.vaadin.student.listener.addstudentlistener.AddStudentButtonClickListener;
import com.aman.vaadin.student.listener.addstudentlistener.BackButtonClickListener;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Panel;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddStudentView extends VerticalLayout implements View {
	
	private static final long serialVersionUID = 1L;

	private TextField idField;
	private TextField nameField;
	private TextField genderField;
	private TextField courseField;
	private TextField emailField;
	private TextField phoneField;
	private TextField usernamField;
	private TextField passworField;

	public AddStudentView() {

		this.addStyleName("desktop");

		Panel addStudentPanel = new Panel("<center>Add Student Form</center>");
		addStudentPanel.setWidth("350px");
		addStudentPanel.addStyleName("test");
		addComponent(addStudentPanel);

		FormLayout addStudentFormLayout = new FormLayout();

		idField = new TextField("ID");
		addStudentFormLayout.addComponent(idField);
		nameField = new TextField("Name");
		addStudentFormLayout.addComponent(nameField);
		genderField = new TextField("Gender");
		addStudentFormLayout.addComponent(genderField);
		courseField = new TextField("Course");
		addStudentFormLayout.addComponent(courseField);
		emailField = new TextField("Email");
		addStudentFormLayout.addComponent(emailField);
		phoneField = new TextField("Phone");
		addStudentFormLayout.addComponent(phoneField);
		usernamField = new TextField("Username");
		addStudentFormLayout.addComponent(usernamField);
		passworField = new TextField("Password");
		addStudentFormLayout.addComponent(passworField);

		Button addStudentButton = new Button("Add Student", new AddStudentButtonClickListener(this));
		Button backButton = new Button("Back To Homepage", new BackButtonClickListener(this));

		addStudentFormLayout.addComponent(addStudentButton);
		addStudentFormLayout.addComponent(backButton);
		addStudentPanel.setContent(addStudentFormLayout);
		setSizeFull();
		addStudentFormLayout.getComponent(6).setWidth("200px");
		addStudentFormLayout.getComponent(7).setWidth("200px");
		setComponentAlignment(addStudentPanel, Alignment.MIDDLE_CENTER);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// Do Something
	}

}
