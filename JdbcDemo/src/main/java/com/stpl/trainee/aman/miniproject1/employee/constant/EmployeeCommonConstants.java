package com.stpl.trainee.aman.miniproject1.employee.constant;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class EmployeeCommonConstants {

	// Add Employee Service Constants
	public static final String INSERT_EMPLOYEE_PERSONAL_DETAILS_QUERY = "INSERT INTO employeePersonalDetails(empId,empName,empAge,empGender,empDesig,empAddress,empSalary) VALUES(?,?,?,?,?,?,?)";
	public static final String INSERT_EMPLOYEE_ACADEMIC_DETAILS_QUERY = "INSERT INTO employeeAcademicDetails(empId,empDegree,empPassYear,empPercentage) VALUES(?,?,?,?)";
	public static final String INSERT_EMPLOYEE_PREVIOUS_EMPLOYEMENT_DETAILS_QUERY = "INSERT INTO employeePreviousEmployementDetails(empId,empCompany,empDesig,empJoinDate,empRelieveDate) VALUES(?,?,?,?,?)";
	public static final String RECORD_AVAILABLE_MESSAGE = " : \nRecord is already available !!!";

	// Delete Employee Service Constants
	public static final String DELETE_EMPLOYEE_QUERY = "DELETE FROM employeePersonalDetails WHERE empId=?";

	// Show Employee Service Constants
	public static final String SHOW_EMPLOYEE_QUERY = "SELECT *FROM employeePersonalDetails AS t1 INNER JOIN employeeAcademicDetails AS t2 ON t1.empId=t2.empId INNER JOIN employeePreviousEmployementDetails AS t3 ON t1.empId=t3.empId";

	// Update Employee Service Constants
	public static final String UPDATE_PERSONAL_DETAILS_QUERY = "SELECT *FROM employeePersonalDetails WHERE empId=?";
	public static final String UPDATE_ACADEMIC_DETAILS_QUERY = "SELECT *FROM employeeAcademicDetails WHERE empId=?";
	public static final String UPDATE_PREVIOUS_EMPLOYEMENT_DETAILS_QUERY = "SELECT *FROM employeePreviousEmployementDetails WHERE empId=?";

	// Employee Menu Constants
	public static final String ADD_MORE_MESSAGE = "\nDo you want to add another record (y/n)?";
	public static final String ENTER_APPROPRIATE_VALUE_MESSAGE = " : Enter appropriate value !!";
	public static final String ENTER_ID_MESSAGE = "\nEnter Employee Id : ";
	public static final String ENTER_CHOICE_MESSAGE = "\nEnter your choice : ";
	public static final String INVALID_CHOICE_MESSAGE = "\nInvalid Choice !!! Try Again.";
	public static final String ANSWER_PARAMETER = "n";

	private EmployeeCommonConstants() {
		// Empty Private Constructor
	}
}
