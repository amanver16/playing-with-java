package com.stpl.trainee.aman.assignment6.studentrepository.service;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stpl.trainee.aman.assignment6.studentrepository.bean.StudentBean;

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
		int id = 1;
		String name = "Khushbu";
		int age = 20;
		String course = "BCA";
		String address = "Banglore";
		String contact = "8085461973";
		
		studentBeanTest.setId(id);
		studentBeanTest.setName(name);
		studentBeanTest.setAge(age);
		studentBeanTest.setCourse(course);
		studentBeanTest.setAddress(address);
		studentBeanTest.setContact(contact);
		assertEquals(true,editStudentServiceTest.editStudentService(studentBeanTest));
	}

	@After
	public void atEnd() {
		studentBeanTest = null;
		editStudentServiceTest = null;
	}

}
