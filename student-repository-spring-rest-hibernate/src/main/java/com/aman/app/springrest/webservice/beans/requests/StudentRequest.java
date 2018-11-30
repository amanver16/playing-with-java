package com.aman.app.springrest.webservice.beans.requests;

import com.aman.app.springrest.webservice.beans.StudentBean;

public class StudentRequest {
	private StudentBean addStudentBean;

	public StudentBean getAddStudentBean() {
		return addStudentBean;
	}

	public void setAddStudentBean(StudentBean addStudentBean) {
		this.addStudentBean = addStudentBean;
	}
}
