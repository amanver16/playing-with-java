package com.aman.vaadin.student.listener.addstudentlistener;

import com.aman.vaadin.student.ui.MyUi;
import com.aman.vaadin.student.view.AddStudentView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class BackButtonClickListener implements ClickListener {

	private static final long serialVersionUID = 1L;
	private AddStudentView addStudentView;

	public BackButtonClickListener(AddStudentView addStudentView) {
		this.addStudentView = addStudentView;
	}

	@Override
	public void buttonClick(ClickEvent clickEvent) {
		addStudentView.getUI().getNavigator().navigateTo(MyUi.MAINVIEW);
	}
}
