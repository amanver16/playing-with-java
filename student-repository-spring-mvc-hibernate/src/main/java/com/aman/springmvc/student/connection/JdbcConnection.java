package com.aman.springmvc.student.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private String databaseURL = "jdbc:sqlserver://GiveDatabaseURL;databaseName=StudentDb";
	private String user = "GiveUsername";
	private String pass = "GivePassword";

	// Method to establish connection
	public Connection getJdbcConnection() throws SQLException {
		return DriverManager.getConnection(databaseURL, user, pass);
	}
	
}
