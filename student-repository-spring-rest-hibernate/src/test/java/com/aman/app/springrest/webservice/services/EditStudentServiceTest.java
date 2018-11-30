package com.aman.app.springrest.webservice.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aman.app.springrest.webservice.beans.StudentBean;

public class EditStudentServiceTest {

	private StudentBean studentBeanTest;
	private EditStudentService editStudentServiceTest;

	@Before
	public void atStart() {
		studentBeanTest = new StudentBean();
		editStudentServiceTest = new EditStudentService();
	}

	@Test
	public void testEditStudentService() {
		int id = 70;
		String name = "Anjali";
		int age = 24;
		String course = "BCA";
		String address = "Chennai";
		String contact = "8085461973";

		studentBeanTest.setId(id);
		studentBeanTest.setName(name);
		studentBeanTest.setAge(age);
		studentBeanTest.setCourse(course);
		studentBeanTest.setAddress(address);
		studentBeanTest.setContact(contact);
		assertEquals(true, editStudentServiceTest.editStudentService(studentBeanTest));
	}

	@After
	public void atEnd() {
		studentBeanTest = null;
		editStudentServiceTest = null;
	}

}
