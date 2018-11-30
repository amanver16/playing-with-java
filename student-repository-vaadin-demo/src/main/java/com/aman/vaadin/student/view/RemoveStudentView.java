package com.aman.vaadin.student.view;

import com.aman.vaadin.student.listener.removestudentlistener.RemoveButtonListener;
import com.aman.vaadin.student.listener.removestudentlistener.RemoveViewBackButtonClickListener;
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
public class RemoveStudentView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	private TextField idField;

	public RemoveStudentView() {

		this.addStyleName("desktop");

		Panel removeStudentPanel = new Panel("<center>Remove Student</center>");
		removeStudentPanel.setWidth("350px");
		removeStudentPanel.addStyleName("test");
		addComponent(removeStudentPanel);

		FormLayout removeStudentFormLayout = new FormLayout();

		idField = new TextField("ID");
		idField.setPlaceholder("Enter ID to be deleted.");
		removeStudentFormLayout.addComponent(idField);

		Button removeStudentButton = new Button("Remove Student", new RemoveButtonListener(this));
		Button backButton = new Button("Back To Homepage", new RemoveViewBackButtonClickListener(this));

		removeStudentFormLayout.addComponent(removeStudentButton);
		removeStudentFormLayout.addComponent(backButton);
		removeStudentPanel.setContent(removeStudentFormLayout);
		setSizeFull();
		setComponentAlignment(removeStudentPanel, Alignment.MIDDLE_CENTER);

	}

	@Override
	public void enter(ViewChangeEvent event) {
		// Do Something
	}

}
