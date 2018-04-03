package com.stpl.trainee.aman.miniproject1.employee.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.stpl.trainee.aman.miniproject1.employee.connection.EmployeeJdbcConnection;
import com.stpl.trainee.aman.miniproject1.employee.constant.EmployeeCommonConstants;

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