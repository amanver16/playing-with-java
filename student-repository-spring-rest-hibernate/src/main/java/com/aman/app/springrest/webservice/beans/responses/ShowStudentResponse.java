package com.aman.app.springrest.webservice.beans.responses;

import com.aman.app.springrest.webservice.beans.StudentBean;

public class ShowStudentResponse {

	private StudentBean studentBean;

	public StudentBean getStudentBean() {
		return studentBean;
	}

	public void setStudentBean(StudentBean studentBean) {
		this.studentBean = studentBean;
	}
}
