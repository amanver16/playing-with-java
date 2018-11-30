package com.aman.jdbc.employee.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class EmployeeJdbcConnection {

	private final Logger connectionLogger = LogManager.getLogger(EmployeeJdbcConnection.class);
	private String databaseURL = "jdbc:sqlserver://give-Database-Url-of-SqlServer;databaseName=EmployeeDb";
	private String username = "Database_Username";
	private String pass = "Database_Password";

	// Method to establish connection
	public Connection employeeJdbcConnection() {

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(databaseURL, username, pass);
		} catch (SQLException sqlException) {
			connectionLogger.info(sqlException + " : \nConnection failed. Terminating program");
			System.exit(0);
		}

		return connection;
	}
}
