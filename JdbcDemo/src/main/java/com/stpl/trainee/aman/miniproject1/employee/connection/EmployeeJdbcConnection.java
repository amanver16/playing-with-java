package com.stpl.trainee.aman.miniproject1.employee.connection;

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
	private String databaseURL = "jdbc:sqlserver://mysqlserver.cb7nxw5w5k4w.us-east-2.rds.amazonaws.com;databaseName=EmployeeDb";
	private String username = "amanver16";
	private String pass = "M3dh!Sql";

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
