package com.aman.jdbc.employee.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.aman.jdbc.employee.connection.EmployeeJdbcConnection;
import com.aman.jdbc.employee.constant.EmployeeCommonConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class ShowEmployeeService {

	private Logger showLogger = LogManager.getLogger(ShowEmployeeService.class);
	private EmployeeJdbcConnection employeeJdbcConnection = new EmployeeJdbcConnection();
	private String border = "\n--------------------------------------------------------------------------------------------------\n";

	// Method to display employee personal details
	public void showDetailsService() {

		try (Connection connection = employeeJdbcConnection.employeeJdbcConnection();
				PreparedStatement showStatement = connection
						.prepareStatement(EmployeeCommonConstants.SHOW_EMPLOYEE_QUERY);
				ResultSet showEmployeeResultSet = showStatement.executeQuery()) {

			ResultSetMetaData employeeResultSetMetaData = showEmployeeResultSet.getMetaData();
			int totalColumns = employeeResultSetMetaData.getColumnCount();

			while (showEmployeeResultSet.next()) {

				showLogger.info(border);

				for (int resultSetIndex = 1; resultSetIndex <= totalColumns; resultSetIndex++) {
					showLogger.info(showEmployeeResultSet.getString(resultSetIndex) + "  ");
				}

				showLogger.info(border);
			}

		} catch (SQLException sqlException) {
			showLogger.info(sqlException + " : \nRecord is not found !!!");
		}
	}
}