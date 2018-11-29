package com.stpl.trainee.aman.miniproject1.employee.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.stpl.trainee.aman.miniproject1.employee.bean.AcademicDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.bean.PersonalDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.bean.PreviousEmployementDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.connection.EmployeeJdbcConnection;
import com.stpl.trainee.aman.miniproject1.employee.constant.EmployeeCommonConstants;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class AddEmployeeService {

	private Logger insertLogger = LogManager.getLogger(AddEmployeeService.class);

	// Method to insert employee personal details
	public boolean addPersonalDetailsService(PersonalDetailsBean personalDetailsBean) {

		EmployeeJdbcConnection employeeJdbcConnection = new EmployeeJdbcConnection();

		try (Connection connection = employeeJdbcConnection.employeeJdbcConnection();
				PreparedStatement insertStatement = connection
						.prepareStatement(EmployeeCommonConstants.INSERT_EMPLOYEE_PERSONAL_DETAILS_QUERY)) {

			insertStatement.setInt(1, personalDetailsBean.getEmpId());
			insertStatement.setString(2, personalDetailsBean.getEmpName());
			insertStatement.setInt(3, personalDetailsBean.getEmpAge());
			insertStatement.setString(4, personalDetailsBean.getEmpGender());
			insertStatement.setString(5, personalDetailsBean.getEmpDesig());
			insertStatement.setString(6, personalDetailsBean.getEmpAddress());
			insertStatement.setInt(7, personalDetailsBean.getEmpSalary());

			if (insertStatement.executeUpdate() > 0) {
				connection.commit();
				return true;
			}

		} catch (SQLException sqlException) {
			insertLogger.info(sqlException + EmployeeCommonConstants.RECORD_AVAILABLE_MESSAGE);
		}

		return false;
	}

	// Method to insert employee academic details
	public boolean addAcademicDetailsService(AcademicDetailsBean academicDetailsBean) {

		EmployeeJdbcConnection employeeJdbcConnection = new EmployeeJdbcConnection();

		try (Connection connection = employeeJdbcConnection.employeeJdbcConnection();
				PreparedStatement insertStatement = connection
						.prepareStatement(EmployeeCommonConstants.INSERT_EMPLOYEE_ACADEMIC_DETAILS_QUERY)) {

			insertStatement.setInt(1, academicDetailsBean.getEmpId());
			insertStatement.setString(2, academicDetailsBean.getEmpDegree());
			insertStatement.setInt(3, academicDetailsBean.getEmpPassYear());
			insertStatement.setFloat(4, academicDetailsBean.getEmpPercentage());

			if (insertStatement.executeUpdate() > 0) {
				return true;
			}

		} catch (SQLException sqlException) {
			insertLogger.info(sqlException + EmployeeCommonConstants.RECORD_AVAILABLE_MESSAGE);
		}

		return false;
	}

	// Method to insert employee previous employment details
	public boolean addPreviousEmployementDetailsService(PreviousEmployementDetailsBean previousEmployementDetailsBean) {

		EmployeeJdbcConnection employeeJdbcConnection = new EmployeeJdbcConnection();

		try (Connection connection = employeeJdbcConnection.employeeJdbcConnection();
				PreparedStatement insertStatement = connection.prepareStatement(
						EmployeeCommonConstants.INSERT_EMPLOYEE_PREVIOUS_EMPLOYEMENT_DETAILS_QUERY)) {

			insertStatement.setInt(1, previousEmployementDetailsBean.getEmpId());
			insertStatement.setString(2, previousEmployementDetailsBean.getEmpCompany());
			insertStatement.setString(3, previousEmployementDetailsBean.getEmpDesig());
			insertStatement.setString(4, previousEmployementDetailsBean.getEmpJoinDate());
			insertStatement.setString(5, previousEmployementDetailsBean.getEmpRelieveDate());

			if (insertStatement.executeUpdate() > 0) {
				return true;
			}

		} catch (SQLException sqlException) {
			insertLogger.info(sqlException + EmployeeCommonConstants.RECORD_AVAILABLE_MESSAGE);
		}

		return false;
	}
}
