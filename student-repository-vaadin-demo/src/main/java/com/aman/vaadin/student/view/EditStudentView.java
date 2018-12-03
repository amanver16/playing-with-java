package com.aman.vaadin.student.view;

import com.aman.vaadin.student.listener.editstudentlistener.EditButtonListener;
import com.aman.vaadin.student.listener.editstudentlistener.EditViewBackButtonListener;
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
public class EditStudentView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	private TextField idField;

	public EditStudentView() {

		this.addStyleName("desktop");

		Panel editStudentPanel = new Panel("<center>Edit Student</center>");
		editStudentPanel.setWidth("350px");
		editStudentPanel.addStyleName("test");
		addComponent(editStudentPanel);

		FormLayout editStudentFormLayout = new FormLayout();

		idField = new TextField("ID");
		editStudentFormLayout.addComponent(idField);

		Button editStudentButton = new Button("Edit Student", new EditButtonListener(this));
		Button editViewBackButton = new Button("Back To Main Menu", new EditViewBackButtonListener(this));

		editStudentFormLayout.addComponent(editStudentButton);
		editStudentFormLayout.addComponent(editViewBackButton);
		editStudentPanel.setContent(editStudentFormLayout);
		setSizeFull();
		setComponentAlignment(editStudentPanel, Alignment.MIDDLE_CENTER);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// Do Something
	}

}
