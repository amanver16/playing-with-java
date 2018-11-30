package com.aman.jdbc.employee.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aman.jdbc.employee.connection.EmployeeJdbcConnection;
import com.aman.jdbc.employee.constant.EmployeeCommonConstants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class UpdateEmployeeService {

	private Logger editLogger = LogManager.getLogger(UpdateEmployeeService.class);
	private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

	// Personal Details Update Service Method
	public boolean updatePersonalDetailsService(int empId) {

		int choice;
		String ans = null;
		EmployeeJdbcConnection employeeJdbcConnection = new EmployeeJdbcConnection();
		ResultSet personalDetailsResultSet = null;

		try (Connection connection = employeeJdbcConnection.employeeJdbcConnection();
				PreparedStatement updateStatement = connection.prepareStatement(
						EmployeeCommonConstants.UPDATE_PERSONAL_DETAILS_QUERY, ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE)) {

			updateStatement.setInt(1, empId);
			updateStatement.executeQuery();
			personalDetailsResultSet = updateStatement.getResultSet();

			while (personalDetailsResultSet.next()) {

				do {

					editLogger.info(
							"\nWhich column do you want to update ?\n1. Name\n2. Age\n3. Gender\n4. Designation\n5. Address\n6. Salary\n7. No Updation\n\nEnter your choice : ");
					choice = Integer.parseInt(input.readLine());

					if (choice == 1) {

						editLogger.info("\nEnter new name : ");
						String newName = input.readLine();
						personalDetailsResultSet.updateString("empName", newName);
						editLogger.info("\nEmployee name updated.\n");
					}

					else if (choice == 2) {

						editLogger.info("\nEnter new age : ");
						int newAge = Integer.parseInt(input.readLine());
						personalDetailsResultSet.updateInt("empAge", newAge);
						editLogger.info("\nEmployee age updated.\n");
					}

					else if (choice == 3) {

						editLogger.info("\nEnter new gender : ");
						String newGender = input.readLine();
						personalDetailsResultSet.updateString("empGender", newGender);
						editLogger.info("\nEmployee gender updated.\n");
					}

					else if (choice == 4) {

						editLogger.info("\nEnter new designation : ");
						String newDesig = input.readLine();
						personalDetailsResultSet.updateString("empDesig", newDesig);
						editLogger.info("\nEmployee designation updated.\n");
					}

					else if (choice == 5) {

						editLogger.info("\nEnter new address : ");
						String newAddress = input.readLine();
						personalDetailsResultSet.updateString("empAddress", newAddress);
						editLogger.info("\nEmployee address updated.\n");
					}

					else if (choice == 6) {

						editLogger.info("\nEnter new salary : ");
						int newSalary = Integer.parseInt(input.readLine());
						personalDetailsResultSet.updateInt("empSalary", newSalary);
						editLogger.info("\nEmployee salary updated.\n");
					}

					else if (choice == 7) {
						editLogger.info("\nNo columns updated.\n");
						return false;
					}

					personalDetailsResultSet.updateRow();
					editLogger.info("\nDo you want to update more columns ?(y/n)");
					ans = input.readLine();

				} while (ans.equalsIgnoreCase("n"));
			}

		} catch (SQLException | IOException | NumberFormatException exception) {
			editLogger.info(exception.getMessage());

		} finally {

			try {
				personalDetailsResultSet.close();
			} catch (SQLException sqlException) {
				editLogger.info(sqlException.getMessage());
			}
		}

		return true;
	}

	// Employee Academic Details Update Method
	public boolean updateAcademicDetailsService(int empId) {

		int choice;
		String answer = null;
		EmployeeJdbcConnection employeeJdbcConnection = new EmployeeJdbcConnection();
		ResultSet academicDetailsResultSet = null;

		try (Connection connection = employeeJdbcConnection.employeeJdbcConnection();
				PreparedStatement updateStatement = connection.prepareStatement(
						EmployeeCommonConstants.UPDATE_ACADEMIC_DETAILS_QUERY, ResultSet.TYPE_SCROLL_SENSITIVE,
						ResultSet.CONCUR_UPDATABLE)) {

			updateStatement.setInt(1, empId);
			updateStatement.executeQuery();
			academicDetailsResultSet = updateStatement.getResultSet();

			while (academicDetailsResultSet.next()) {

				do {

					editLogger.info(
							"\nWhich column do you want to update ?\n1. Degree\n2. Pass Year\n3. Percentage\n4. No Updation\n\nEnter your choice : ");
					choice = Integer.parseInt(input.readLine());

					if (choice == 1) {

						editLogger.info("\nEnter new degree : ");
						String newDegree = input.readLine();
						academicDetailsResultSet.updateString("empDegree", newDegree);
						editLogger.info("\nEmployee degree updated.\n");
					}

					else if (choice == 2) {

						editLogger.info("\nEnter new pass year : ");
						int newPassYear = Integer.parseInt(input.readLine());
						academicDetailsResultSet.updateInt("empPassYear", newPassYear);
						editLogger.info("\nEmployee pass year updated.\n");
					}

					else if (choice == 3) {

						editLogger.info("\nEnter new percentage : ");
						int newPercentage = Integer.parseInt(input.readLine());
						academicDetailsResultSet.updateInt("empPercentage", newPercentage);
						editLogger.info("\nEmployee percentage updated.\n");
					}

					else if (choice == 4) {
						editLogger.info("\nNo column updated.\n");
						return false;
					}

					academicDetailsResultSet.updateRow();
					editLogger.info("\nDo you want to update any more column ? y/n");
					answer = input.readLine();

				} while (answer.equalsIgnoreCase("n"));
			}

		} catch (SQLException | IOException | NumberFormatException e) {
			editLogger.info(e.getMessage());

		} finally {

			try {
				academicDetailsResultSet.close();
			} catch (SQLException sqlException) {
				editLogger.info(sqlException.getMessage());
			}
		}

		return true;
	}

	// Employee Previous Employment Details Update Method
	public boolean updatePreviousEmploymentDetailsService(int empId) {

		int choice;
		String ans = null;
		EmployeeJdbcConnection employeeJdbcConnection = new EmployeeJdbcConnection();
		ResultSet previousEmploymentDetailsResultSet = null;

		try (Connection connection = employeeJdbcConnection.employeeJdbcConnection();
				PreparedStatement updateStatement = connection.prepareStatement(
						EmployeeCommonConstants.UPDATE_PREVIOUS_EMPLOYEMENT_DETAILS_QUERY,
						ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

			updateStatement.setInt(1, empId);
			updateStatement.executeQuery();
			previousEmploymentDetailsResultSet = updateStatement.getResultSet();

			while (previousEmploymentDetailsResultSet.next()) {

				do {

					editLogger.info(
							"\nWhich column do you want to update ?\n1. Company\n2. Designation\n3. Join Date\n4. Relieve Date\n5. No Updation\n\nEnter your choice : ");
					choice = Integer.parseInt(input.readLine());

					if (choice == 1) {

						editLogger.info("\nEnter new company : ");
						String newCompany = input.readLine();
						previousEmploymentDetailsResultSet.updateString("empCompany", newCompany);
						editLogger.info("\nEmployee company updated.\n");
					}

					else if (choice == 2) {

						editLogger.info("\nEnter new designation : ");
						String newDesig = input.readLine();
						previousEmploymentDetailsResultSet.updateString("empDesig", newDesig);
						editLogger.info("\nEmployee designation updated.\n");
					}

					else if (choice == 3) {

						editLogger.info("\nEnter new join date : ");
						String newJoinDate = input.readLine();
						previousEmploymentDetailsResultSet.updateString("empJoinDate", newJoinDate);
						editLogger.info("\nEmployee join date updated.\n");
					}

					else if (choice == 4) {

						editLogger.info("\nEnter new relieve date : ");
						String newRelieveDate = input.readLine();
						previousEmploymentDetailsResultSet.updateString("empRelieveDate", newRelieveDate);
						editLogger.info("\nEmployee relieve date updated.\n");
					}

					else if (choice == 5) {
						editLogger.info("\nNo columns are updated.\n");
						return false;
					}

					previousEmploymentDetailsResultSet.updateRow();
					editLogger.info("\nDo you want to update more columns ?(y/n)");
					ans = input.readLine();

				} while (ans.equalsIgnoreCase("y"));
			}

		} catch (SQLException | IOException | NumberFormatException exception) {
			editLogger.info(exception.getMessage());

		} finally {

			try {
				previousEmploymentDetailsResultSet.close();
			} catch (SQLException sqlException) {
				editLogger.info(sqlException.getMessage());
			}
		}

		return true;
	}
}
