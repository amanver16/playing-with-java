package com.stpl.trainee.aman.miniproject1.employee.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stpl.trainee.aman.miniproject1.employee.service.UpdateEmployeeService;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class UpdateEmployeeServiceTest {

	private UpdateEmployeeService updateEmployeeService;

	@Before
	public void atBeginning() {
		updateEmployeeService = new UpdateEmployeeService();
	}

	// Update Personal Details Service Test Method
	@Test
	public void testUpdatePersonalDetailsService() {
		int empId = 1;
		assertEquals(true, updateEmployeeService.updatePersonalDetailsService(empId));
	}

	// Update Academic Details Service Test Method
	@Test
	public void testUpdateAcademicDetailsService() {
		int empId = 1;
		assertEquals(true, updateEmployeeService.updateAcademicDetailsService(empId));
	}

	// Update Previous Employment Details Service Test Method
	@Test
	public void testUpdatePreviousEmployementDetailsService() {
		int empId = 1;
		assertEquals(true, updateEmployeeService.updatePreviousEmploymentDetailsService(empId));
	}

	@After
	public void atEnd() {
		updateEmployeeService = null;
	}
}
