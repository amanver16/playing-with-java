package com.aman.jdbc.employee.bean;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class PreviousEmployementDetailsBean {

	private int empId;
	private String empCompany;
	private String empDesig;
	private String empJoinDate;
	private String empRelieveDate;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpCompany() {
		return empCompany;
	}

	public void setEmpCompany(String empCompany) {
		this.empCompany = empCompany;
	}

	public String getEmpDesig() {
		return empDesig;
	}

	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}

	public String getEmpJoinDate() {
		return empJoinDate;
	}

	public void setEmpJoinDate(String empJoinDate) {
		this.empJoinDate = empJoinDate;
	}

	public String getEmpRelieveDate() {
		return empRelieveDate;
	}

	public void setEmpRelieveDate(String empRelieveDate) {
		this.empRelieveDate = empRelieveDate;
	}
}
