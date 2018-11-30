package com.aman.vaadin.student.listener.addstudentlistener;

import com.aman.vaadin.student.bean.StudentBean;
import com.aman.vaadin.student.service.AddStudentService;
import com.aman.vaadin.student.ui.NotificationViewer;
import com.aman.vaadin.student.view.AddStudentView;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;

public class AddStudentButtonClickListener implements ClickListener {

	private static final long serialVersionUID = 1L;
	
	private AddStudentView addStudentView;

	public AddStudentButtonClickListener(AddStudentView addStudentView) {
		this.addStudentView = addStudentView;
	}

	@Override
	public void buttonClick(ClickEvent clickEvent) {

		int id = Integer.parseInt(addStudentView.getIdField().getValue());
		String name = addStudentView.getNameField().getValue();
		String gender = addStudentView.getGenderField().getValue();
		String course = addStudentView.getCourseField().getValue();
		String email = addStudentView.getEmailField().getValue();
		int phone = Integer.parseInt(addStudentView.getPhoneField().getValue());
		String username = addStudentView.getUsernamField().getValue();
		String password = addStudentView.getPassworField().getValue();

		StudentBean studentBean = new StudentBean();

		studentBean.setId(id);
		studentBean.setName(name);
		studentBean.setGender(gender);
		studentBean.setCourse(course);
		studentBean.setEmail(email);
		studentBean.setPhone(phone);
		studentBean.setUsername(username);
		studentBean.setPassword(password);

		AddStudentService addStudentService = new AddStudentService();
		NotificationViewer notificationViewer = new NotificationViewer();

		if (addStudentService.addStudent(studentBean)) {
			notificationViewer.getNotification("Student Added Successfully !!!");
		} else {
			notificationViewer.getNotification("Student is already available !!!");
		}
	}

}
