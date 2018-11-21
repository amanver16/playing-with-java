package com.stpl.trainee.aman.assignment3.studentrepository.service.bean;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class StudentBean {

	private int studentId;
	private String studentName;
	private int[] studentMarks = new int[3];

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int id) {
		this.studentId = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String name) {
		this.studentName = name;
	}

	public int[] getStudentMarks() {
		return studentMarks;
	}

	public void setStudentMarks(int[] marks) {
		this.studentMarks = marks;
	}

	@Override
	public String toString() {
		return studentId + " " + studentName + " " + studentMarks[0] + " " + studentMarks[1] + " " + studentMarks[2];
	}
}
