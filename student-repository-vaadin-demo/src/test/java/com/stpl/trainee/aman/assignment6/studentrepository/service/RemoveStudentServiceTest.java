package com.stpl.trainee.aman.assignment6.studentrepository.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stpl.trainee.aman.assignment6.studentrepository.bean.StudentBean;

public class RemoveStudentServiceTest {

	private StudentBean studentBeanTest;	
	private RemoveStudentService removeStudentServiceTest;
	
	@Before
	public void atStart() {
		studentBeanTest = new StudentBean();
		removeStudentServiceTest = new RemoveStudentService();
	}
	
	@Test
	public void testRemoveStudentService() {
		int id = 16;
		studentBeanTest.setId(id);
		assertEquals(true,removeStudentServiceTest.removeStudentService(studentBeanTest));
	}

	@After
	public void atEnd() {
		studentBeanTest = null;
		removeStudentServiceTest = null;
	}

}
