package com.aman.jdbc.employee.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aman.jdbc.employee.connection.EmployeeJdbcConnection;
import com.aman.jdbc.employee.constant.EmployeeCommonConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class DeleteEmployeeService {

	private Logger deleteLogger = LogManager.getLogger();

	// Delete Employee Service Method
	public boolean deleteEmployeeService(int empId) {

		EmployeeJdbcConnection employeeJdbcConnection = new EmployeeJdbcConnection();

		try (Connection connection = employeeJdbcConnection.employeeJdbcConnection();
				PreparedStatement deleteStatement = connection
						.prepareStatement(EmployeeCommonConstants.DELETE_EMPLOYEE_QUERY)) {

			deleteStatement.setInt(1, empId);
			deleteStatement.executeUpdate();
			return true;

		} catch (SQLException sqlException) {
			deleteLogger.info(sqlException+" : \nRecord not deleted/found !!!");
		}

		return false;
	}
}