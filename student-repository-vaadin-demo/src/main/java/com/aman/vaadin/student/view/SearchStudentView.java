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
public class SearchStudentView extends VerticalLayout implements View {
	
	private static final long serialVersionUID = 1L;

	private TextField idField;

	public SearchStudentView() {

		this.addStyleName("desktop");

		Panel searchStudentPanel = new Panel("<center>Add Student Form</center>");
		searchStudentPanel.setWidth("350px");
		searchStudentPanel.addStyleName("test");
		addComponent(searchStudentPanel);

		FormLayout searchStudentFormLayout = new FormLayout();

		idField = new TextField("ID");
		searchStudentFormLayout.addComponent(idField);
		
		Button searchStudentButton = new Button("Search Student", new AddStudentButtonClickListener(this));
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
