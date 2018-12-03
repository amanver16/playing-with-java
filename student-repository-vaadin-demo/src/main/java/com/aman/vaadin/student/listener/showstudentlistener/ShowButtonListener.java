package com.aman.vaadin.student.listener.showstudentlistener;

import java.util.ArrayList;
import java.util.List;

import com.aman.vaadin.student.bean.StudentBean;
import com.aman.vaadin.student.service.SearchStudentService;
import com.aman.vaadin.student.ui.NotificationViewer;
import com.aman.vaadin.student.view.ShowStudentView;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Button.ClickListener;
import com.vaadin.ui.Grid;

public class ShowButtonListener implements ClickListener {

	private static final long serialVersionUID = 1L;

	private ShowStudentView showStudentView;

	public ShowButtonListener(ShowStudentView showStudentView) {
		this.showStudentView = showStudentView;
	}

	@Override
	public void buttonClick(ClickEvent clickEvent) {

		int id = Integer.parseInt(showStudentView.getIdField().getValue());
		SearchStudentService searchStudentService = new SearchStudentService();
		StudentBean studentBean = searchStudentService.searchStudent(id);
		NotificationViewer notificationViewer = new NotificationViewer();

		if (studentBean != null) {
			List<StudentBean> studentBeanList = new ArrayList<>();
			studentBeanList.add(studentBean);
			showInTable(studentBeanList);
		} else {
			notificationViewer.getNotification("Student is not available !!!");
		}
	}

	// Method to show details in a table
	public void showInTable(List<StudentBean> studentBeanList) {

		Grid<StudentBean> grid = new Grid<>();		
		grid.setItems(studentBeanList);

		grid.addColumn(StudentBean::getId).setCaption("ID");
		grid.addColumn(StudentBean::getName).setCaption("Name");
		grid.addColumn(StudentBean::getGender).setCaption("Gender");
		grid.addColumn(StudentBean::getCourse).setCaption("Course");
		grid.addColumn(StudentBean::getEmail).setCaption("Email");
		grid.addColumn(StudentBean::getPhone).setCaption("Phone");

		showStudentView.addComponent(grid);
		showStudentView.setSizeFull();
		showStudentView.setComponentAlignment(grid, Alignment.MIDDLE_CENTER);
	}

}
