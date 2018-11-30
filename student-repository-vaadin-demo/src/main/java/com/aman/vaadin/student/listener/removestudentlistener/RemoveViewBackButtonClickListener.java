package com.aman.vaadin.student.listener.removestudentlistener;

import com.aman.vaadin.student.ui.MyUi;
import com.aman.vaadin.student.view.RemoveStudentView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class RemoveViewBackButtonClickListener implements ClickListener {

	private static final long serialVersionUID = 1L;

	private RemoveStudentView removeStudentView;

	public RemoveViewBackButtonClickListener(RemoveStudentView removeStudentView) {
		this.removeStudentView = removeStudentView;
	}

	@Override
	public void buttonClick(ClickEvent clickEvent) {
		removeStudentView.getUI().getNavigator().navigateTo(MyUi.MAINVIEW);
	}
}
