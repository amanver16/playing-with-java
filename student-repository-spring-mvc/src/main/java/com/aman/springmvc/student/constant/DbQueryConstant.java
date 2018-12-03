package com.aman.springmvc.student.constant;

public class DbQueryConstant {
	
	public static final String INSERTQUERY = "INSERT INTO STUDENT VALUES(?,?,?,?,?,?,?,?)";
	public static final String DELETEQUERY = "DELETE FROM STUDENT WHERE ID = ?";
	public static final String UPDATEQUERY = "UPDATE STUDENT SET NAME = ?, GENDER = ?, COURSE = ?, EMAIL = ?, PHONE = ?, USERNAME = ?, PASSWORD = ? WHERE ID = ?";
	public static final String SEARCHQUERY = "SELECT *FROM STUDENT WHERE ID = ?";
	public static final String LOGINQUERY = "SELECT * FROM STUDENT WHERE USERNAME = ? AND PASSWORD = ?";

	private DbQueryConstant() {
		// Private Constructor
	}
	
}
