package com.aman.java.student.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private String databaseURL = "jdbc:sqlserver://YourDatabaseURL;databaseName=YourDatabaseName;";
	private String usr = "GiveUsername";
	private String pd = "GivePassword";

	public Connection getJdbcConnection() throws SQLException {
		return DriverManager.getConnection(databaseURL, usr, pd);
	}

}
