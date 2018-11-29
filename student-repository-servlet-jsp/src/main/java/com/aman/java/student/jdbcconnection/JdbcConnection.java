package com.aman.java.student.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private String databaseURL = "jdbc:sqlserver://mysqlserver.cb7nxw5w5k4w.us-east-2.rds.amazonaws.com;databaseName=StudentDb;";
	private String usr = "amanver16";
	private String pd = "M3dh!Sql";

	public Connection getJdbcConnection() throws SQLException {
		return DriverManager.getConnection(databaseURL, usr, pd);
	}

}
