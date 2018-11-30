package com.aman.vaadin.student.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private String databaseURL = "jdbc:sqlserver://mysqlserver.cb7nxw5w5k4w.us-east-2.rds.amazonaws.com;databaseName=StudentDb";
	private String user = "amanver16";
	private String pass = "M3dh!Sql";

	// Method to establish connection
	public Connection getJdbcConnection() throws SQLException {
		return DriverManager.getConnection(databaseURL, user, pass);
	}
	
}
