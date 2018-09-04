package com.stpl.trainee.aman.springrest.webservice.beans.requests;

import com.stpl.trainee.aman.springrest.webservice.beans.StudentBean;

public class StudentRequest {
	private StudentBean addStudentBean;

	public StudentBean getAddStudentBean() {
		return addStudentBean;
	}

	public void setAddStudentBean(StudentBean addStudentBean) {
		this.addStudentBean = addStudentBean;
	}
}
