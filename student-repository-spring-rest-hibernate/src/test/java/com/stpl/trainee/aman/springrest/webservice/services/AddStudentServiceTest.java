package com.stpl.trainee.aman.springrest.webservice.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stpl.trainee.aman.springrest.webservice.beans.StudentBean;



public class AddStudentServiceTest {
	private StudentBean studentBeanTest;
	private AddStudentService addStudentServiceTest;

	@Before
	public void atStart() {
		studentBeanTest = new StudentBean();
		addStudentServiceTest = new AddStudentService();
	}

	@Test
	public void testAddStudentService() {

		int id = 70;
		String name = "Anjana";
		int age = 20;
		String course = "BCA";
		String address = "Goa";
		String contact = "8085461973";

		studentBeanTest.setId(id);
		studentBeanTest.setName(name);
		studentBeanTest.setAge(age);
		studentBeanTest.setCourse(course);
		studentBeanTest.setAddress(address);
		studentBeanTest.setContact(contact);

		assertEquals(true, addStudentServiceTest.addStudentService(studentBeanTest));
	}

	@After
	public void atEnd() {
		studentBeanTest = null;
		addStudentServiceTest = null;
	}
}
