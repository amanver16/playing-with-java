package com.aman.project.library.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

	private String databaseURL = "jdbc:sqlserver://mysqlserver.cdcf6uwqcgpl.ap-south-1.rds.amazonaws.com;databaseName=Library;";
	private String usr = "amanver16";
	private String pd = "";

	public Connection getJdbcConnection() throws SQLException {
		return DriverManager.getConnection(databaseURL, usr, pd);
	}

}
