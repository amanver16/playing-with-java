package com.aman.vaadin.student.listener.removestudentlistener;

import com.aman.vaadin.student.service.RemoveStudentService;
import com.aman.vaadin.student.ui.NotificationViewer;
import com.aman.vaadin.student.view.RemoveStudentView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class RemoveButtonListener implements ClickListener {

	private static final long serialVersionUID = 1L;
	
	private RemoveStudentView removeStudentView;

	public RemoveButtonListener(RemoveStudentView removeStudentView) {
		this.removeStudentView = removeStudentView;
	}

	@Override
	public void buttonClick(ClickEvent clickEvent) {

		RemoveStudentService removeStudentService = new RemoveStudentService();
        NotificationViewer notificationViewer = new NotificationViewer();
        int id = Integer.parseInt(removeStudentView.getIdField().getValue());

		if (removeStudentService.removeStudent(id)) {
			notificationViewer.getNotification("Student Deleted Successfully !!!");
		} else {
			notificationViewer.getNotification("Student not deleted !!!");
		}
	}

}
