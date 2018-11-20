package com.stpl.trainee.aman.miniproject1.employee.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stpl.trainee.aman.miniproject1.employee.bean.AcademicDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.bean.PersonalDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.bean.PreviousEmployementDetailsBean;
import com.stpl.trainee.aman.miniproject1.employee.service.AddEmployeeService;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class AddEmployeeServiceTest {

	private AddEmployeeService addEmployeeService;
	private PersonalDetailsBean personalDetailsBean;
	private AcademicDetailsBean academicDetailsBean;
	private PreviousEmployementDetailsBean previousEmployementDetailsBean;

	@Before
	public void atBeginning() {

		addEmployeeService = new AddEmployeeService();
		personalDetailsBean = new PersonalDetailsBean();
		academicDetailsBean = new AcademicDetailsBean();
		previousEmployementDetailsBean = new PreviousEmployementDetailsBean();
	}

	// Add Personal Details Service Test Method
	@Test
	public void testAddPersonalDetailsService() {

		int empId = 3;
		String empName = "Anil";
		int empAge = 25;
		String empGender = "Male";
		String empDesig = "Clerk";
		String empAddress = "Delhi";
		int empSalary = 20000;

		personalDetailsBean.setEmpId(empId);
		personalDetailsBean.setEmpName(empName);
		personalDetailsBean.setEmpAge(empAge);
		personalDetailsBean.setEmpGender(empGender);
		personalDetailsBean.setEmpDesig(empDesig);
		personalDetailsBean.setEmpAddress(empAddress);
		personalDetailsBean.setEmpSalary(empSalary);

		assertEquals(true, addEmployeeService.addPersonalDetailsService(personalDetailsBean));
	}

	// Add Academic Details Service Test Method
	@Test
	public void testAddAcademicDetailsService() {

		int empId = 3;
		String empDegree = "BCA";
		int empPassYear = 2014;
		float empPercentage = 80.5f;

		academicDetailsBean.setEmpId(empId);
		academicDetailsBean.setEmpDegree(empDegree);
		academicDetailsBean.setEmpPassYear(empPassYear);
		academicDetailsBean.setEmpPercentage(empPercentage);

		assertEquals(true, addEmployeeService.addAcademicDetailsService(academicDetailsBean));
	}

	// Add Previous Employment Details Service Test Method
	@Test
	public void testAddPreviousEmployementDetailsService() {

		int empId = 3;
		String empCompany = "TCS";
		String empDesig = "Clerk";
		String empJoinDate = "2014-6-12";
		String empRelieveDate = "2016-12-10";

		previousEmployementDetailsBean.setEmpId(empId);
		previousEmployementDetailsBean.setEmpCompany(empCompany);
		previousEmployementDetailsBean.setEmpDesig(empDesig);
		previousEmployementDetailsBean.setEmpJoinDate(empJoinDate);
		previousEmployementDetailsBean.setEmpRelieveDate(empRelieveDate);

		assertEquals(true, addEmployeeService.addPreviousEmployementDetailsService(previousEmployementDetailsBean));
	}

	@After
	public void atEnd() {
		
		addEmployeeService = null;
		personalDetailsBean = null;
		academicDetailsBean = null;
		previousEmployementDetailsBean = null;
	}

}
