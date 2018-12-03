package com.aman.vaadin.student.view;

import com.aman.vaadin.student.listener.showstudentlistener.ShowButtonListener;
import com.aman.vaadin.student.listener.showstudentlistener.ShowViewBackButtonListener;
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
public class ShowStudentView extends VerticalLayout implements View {

	private static final long serialVersionUID = 1L;

	private TextField idField;

	public ShowStudentView() {

		this.addStyleName("desktop");

		Panel viewStudentPanel = new Panel("<center>View Student</center>");
		viewStudentPanel.setWidth("350px");
		viewStudentPanel.addStyleName("test");
		addComponent(viewStudentPanel);

		FormLayout viewStudentFormLayout = new FormLayout();

		idField = new TextField("ID");
		viewStudentFormLayout.addComponent(idField);

		Button showStudentButton = new Button("Show Student", new ShowButtonListener(this));
		Button showViewBackButton = new Button("Back To Main Menu", new ShowViewBackButtonListener(this));

		viewStudentFormLayout.addComponent(showStudentButton);
		viewStudentFormLayout.addComponent(showViewBackButton);
		viewStudentPanel.setContent(viewStudentFormLayout);
		setSizeFull();
		setComponentAlignment(viewStudentPanel, Alignment.MIDDLE_CENTER);
	}

	@Override
	public void enter(ViewChangeEvent event) {
		// Auto-generated method stub
	}

}
