package com.stpl.trainee.aman.miniproject1.employee.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.stpl.trainee.aman.miniproject1.employee.bean.AcademicDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.bean.PersonalDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.bean.PreviousEmployementDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.constant.EmployeeCommonConstants;
import com.stpl.trainee.aman.miniproject1.employee.service.AddEmployeeService;
import com.stpl.trainee.aman.miniproject1.employee.service.DeleteEmployeeService;
import com.stpl.trainee.aman.miniproject1.employee.service.ShowEmployeeService;
import com.stpl.trainee.aman.miniproject1.employee.service.UpdateEmployeeService;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class EmployeeMenu {

	private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	private static final Logger MENU_LOGGER = LogManager.getLogger(EmployeeMenu.class);

	// Add Employee Details Menu Method
	public void addEmployeeDetailsMenu() {

		int choice;

		do {

			try {

				MENU_LOGGER.info("\n==========Add Employee Details Menu==========");
				MENU_LOGGER.info("1. Add Personal Details.");
				MENU_LOGGER.info("2. Add Academic Details.");
				MENU_LOGGER.info("3. Add Previous Employement Details.");
				MENU_LOGGER.info("4. Exit.");
				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_CHOICE_MESSAGE);

				choice = Integer.parseInt(input.readLine());

				switch (choice) {

				case 1:
					inputEmployeePersonalDetails();
					break;

				case 2:
					inputEmployeeAcademicDetails();
					break;

				case 3:
					inputEmployeePreviousEmployementDetails();
					break;

				case 4:
					return;

				default:
					MENU_LOGGER.info(EmployeeCommonConstants.INVALID_CHOICE_MESSAGE);
				}

			} catch (IOException | NumberFormatException exception) {
				MENU_LOGGER.info(exception + EmployeeCommonConstants.ENTER_APPROPRIATE_VALUE_MESSAGE);
			}

		} while (true);
	}

	// Method to input employee personal details
	public void inputEmployeePersonalDetails() {

		AddEmployeeService addEmployeeService = new AddEmployeeService();

		do {

			try {

				MENU_LOGGER.info("\nEnter Employee Personal Details : ");
				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_ID_MESSAGE);
				int empId = Integer.parseInt(input.readLine());
				MENU_LOGGER.info("Enter Employee Name : ");
				String empName = input.readLine();
				MENU_LOGGER.info("Enter Employee Age : ");
				int empAge = Integer.parseInt(input.readLine());
				MENU_LOGGER.info("Enter Employee Gender : ");
				String empGender = input.readLine();
				MENU_LOGGER.info("Enter Employee Designation : ");
				String empDesig = input.readLine();
				MENU_LOGGER.info("Enter Employee Address : ");
				String empAddress = input.readLine();
				MENU_LOGGER.info("Enter Employee Salary : ");
				int empSalary = Integer.parseInt(input.readLine());

				PersonalDetailsBean personalDetailsBean = new PersonalDetailsBean();

				personalDetailsBean.setEmpId(empId);
				personalDetailsBean.setEmpName(empName);
				personalDetailsBean.setEmpAge(empAge);
				personalDetailsBean.setEmpGender(empGender);
				personalDetailsBean.setEmpDesig(empDesig);
				personalDetailsBean.setEmpAddress(empAddress);
				personalDetailsBean.setEmpSalary(empSalary);

				if (addEmployeeService.addPersonalDetailsService(personalDetailsBean)) {
					MENU_LOGGER.info("Record added in Personal Details.");
				} else {
					MENU_LOGGER.info("Record is not added in Personal Details.");
				}

				MENU_LOGGER.info(EmployeeCommonConstants.ADD_MORE_MESSAGE);
				String answer = input.readLine();

				if (answer.equalsIgnoreCase(EmployeeCommonConstants.ANSWER_PARAMETER)) {
					return;
				}

			} catch (IOException | NumberFormatException exception) {
				MENU_LOGGER.info(exception + EmployeeCommonConstants.ENTER_APPROPRIATE_VALUE_MESSAGE);
			}

		} while (true);
	}

	// Method to input employee academic details
	public void inputEmployeeAcademicDetails() {

		AddEmployeeService addEmployeeService = new AddEmployeeService();

		do {

			try {

				MENU_LOGGER.info("\nEnter Employee Academic Details : ");
				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_ID_MESSAGE);
				int empId = Integer.parseInt(input.readLine());
				MENU_LOGGER.info("\nEnter Employee Degree : ");
				String empDegree = input.readLine();
				MENU_LOGGER.info("\nEnter Employee Passing Year : ");
				int empPassYear = Integer.parseInt(input.readLine());
				MENU_LOGGER.info("\nEnter Employee Percentage : ");
				float empPercentage = Float.parseFloat(input.readLine());

				AcademicDetailsBean academicDetailsBean = new AcademicDetailsBean();

				academicDetailsBean.setEmpId(empId);
				academicDetailsBean.setEmpDegree(empDegree);
				academicDetailsBean.setEmpPassYear(empPassYear);
				academicDetailsBean.setEmpPercentage(empPercentage);

				if (addEmployeeService.addAcademicDetailsService(academicDetailsBean)) {
					MENU_LOGGER.info("\nRecord added in Employee Academic Details.");
				} else {
					MENU_LOGGER.info("\nRecord is not added in Employee Academic Details.");
				}

				MENU_LOGGER.info(EmployeeCommonConstants.ADD_MORE_MESSAGE);
				String choice = input.readLine();

				if (choice.equalsIgnoreCase(EmployeeCommonConstants.ANSWER_PARAMETER)) {
					return;
				}

			} catch (IOException | NumberFormatException exception) {
				MENU_LOGGER.info(exception);
				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_APPROPRIATE_VALUE_MESSAGE);
			}

		} while (true);
	}

	// Method to input employee previous employment details
	public void inputEmployeePreviousEmployementDetails() {

		AddEmployeeService addEmployeeService = new AddEmployeeService();

		do {

			try {

				MENU_LOGGER.info("\nEnter Employee Previous Employment Details : ");
				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_ID_MESSAGE);
				int empId = Integer.parseInt(input.readLine());
				MENU_LOGGER.info("\nEnter Employee Company : ");
				String empCompany = input.readLine();
				MENU_LOGGER.info("\nEnter Employee Designation : ");
				String empDesig = input.readLine();
				MENU_LOGGER.info("\nEnter Employee Join Date : ");
				String empJoinDate = input.readLine();
				MENU_LOGGER.info("\nEnter Employee Relieve Date : ");
				String empRelieveDate = input.readLine();

				PreviousEmployementDetailsBean previousEmployementDetailsBean = new PreviousEmployementDetailsBean();

				previousEmployementDetailsBean.setEmpId(empId);
				previousEmployementDetailsBean.setEmpCompany(empCompany);
				previousEmployementDetailsBean.setEmpDesig(empDesig);
				previousEmployementDetailsBean.setEmpJoinDate(empJoinDate);
				previousEmployementDetailsBean.setEmpRelieveDate(empRelieveDate);

				if (addEmployeeService.addPreviousEmployementDetailsService(previousEmployementDetailsBean)) {
					MENU_LOGGER.info("\nRecord added in Previous Employement Details.");
				} else {
					MENU_LOGGER.info("\nRecord is not added in Previous Employement Details.");
				}

				MENU_LOGGER.info(EmployeeCommonConstants.ADD_MORE_MESSAGE);
				String ans = input.readLine();

				if (ans.equalsIgnoreCase(EmployeeCommonConstants.ANSWER_PARAMETER)) {
					return;
				}

			} catch (IOException | NumberFormatException previosEmploymentInputException) {
				MENU_LOGGER.info(previosEmploymentInputException);
				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_APPROPRIATE_VALUE_MESSAGE);
			}

		} while (true);
	}

	// Update menu method
	public void updateEmployeeDetailsMenu() {

		int choice;
		int empId;
		boolean isUpdated = false;
		UpdateEmployeeService updateEmployeeService = new UpdateEmployeeService();

		do {

			try {

				MENU_LOGGER.info(
						"\n==========Update Employee Details==========\n1. Update Personal Details.\n2. Update Academic Details.\n3. Update Previous Employement Details.\n4. Exit.\n\nEnter your choice : ");
				choice = Integer.parseInt(input.readLine());

				if (choice == 4) {
					return;
				}

				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_ID_MESSAGE);
				empId = Integer.parseInt(input.readLine());

				switch (choice) {

				case 1:
					isUpdated = updateEmployeeService.updatePersonalDetailsService(empId);
					break;

				case 2:
					isUpdated = updateEmployeeService.updateAcademicDetailsService(empId);
					break;

				case 3:
					isUpdated = updateEmployeeService.updatePreviousEmploymentDetailsService(empId);
					break;

				default:
					MENU_LOGGER.info(EmployeeCommonConstants.INVALID_CHOICE_MESSAGE);
				}

			} catch (IOException | NumberFormatException updateException) {
				MENU_LOGGER.info(updateException);
				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_APPROPRIATE_VALUE_MESSAGE);
			}

			checkIfUpdated(isUpdated);

		} while (true);
	}

	// Method to check if record is updated
	public void checkIfUpdated(boolean isUpdated) {

		if (isUpdated) {
			MENU_LOGGER.info("\n1 record updated.");
		} else {
			MENU_LOGGER.info("\nNo record updated.");
		}
	}

	// Method to delete employee
	public void deleteEmployeeDetailsById() {

		DeleteEmployeeService deleteEmployeeService = new DeleteEmployeeService();

		do {

			try {

				MENU_LOGGER.info("\nEnter Employee Id to be deleted : ");
				int empId = Integer.parseInt(input.readLine());

				if (deleteEmployeeService.deleteEmployeeService(empId)) {
					MENU_LOGGER.info("\n1 Record Deleted.\n");
				} else {
					MENU_LOGGER.info("\nNo Record Deleted.\n");
				}

				MENU_LOGGER.info("\n Do you want to delete any other record ?(y/n)");
				String addMore = input.readLine();

				if (addMore.equalsIgnoreCase(EmployeeCommonConstants.ANSWER_PARAMETER)) {
					return;
				}

			} catch (IOException | NumberFormatException deleteException) {
				MENU_LOGGER.info(deleteException);
				MENU_LOGGER.info(EmployeeCommonConstants.ENTER_APPROPRIATE_VALUE_MESSAGE);
			}

		} while (true);
	}

	// Show Employee Details By Id
	public void showEmployeeDetailsById() {
		ShowEmployeeService showEmployeeService = new ShowEmployeeService();
		showEmployeeService.showDetailsService();
	}

	// Main method
	public static void main(String[] args) {

		int choice;
		EmployeeMenu employeeMenu = new EmployeeMenu();

		do {

			try {

				MENU_LOGGER.info("\n**********Employee Management System**********");
				MENU_LOGGER.info("1. Add Employee Details.");
				MENU_LOGGER.info("2. Update Employee Details.");
				MENU_LOGGER.info("3. Delete Employee Details.");
				MENU_LOGGER.info("4. Show Employee Details.");
				MENU_LOGGER.info("5. Exit.");
				MENU_LOGGER.info("\nEnter Your Choice :");

				choice = Integer.parseInt(input.readLine());

				switch (choice) {

				case 1:
					employeeMenu.addEmployeeDetailsMenu();
					break;

				case 2:
					employeeMenu.updateEmployeeDetailsMenu();
					break;

				case 3:
					employeeMenu.deleteEmployeeDetailsById();
					break;

				case 4:
					employeeMenu.showEmployeeDetailsById();
					break;

				case 5:
					MENU_LOGGER.info("Program Terminated !!!");
					return;

				default:
					MENU_LOGGER.info(EmployeeCommonConstants.INVALID_CHOICE_MESSAGE);
				}

			} catch (IOException | NumberFormatException mainMenuxception) {
				MENU_LOGGER.info(mainMenuxception + EmployeeCommonConstants.ENTER_APPROPRIATE_VALUE_MESSAGE);
			}

		} while (true);
	}

}
