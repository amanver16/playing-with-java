package com.aman.vaadin.student.service;

import static org.junit.Assert.assertEquals;

import com.aman.vaadin.student.bean.StudentBean;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AddStudentServiceTest {

	private StudentBean studentBean;
	private AddStudentService addStudentService;

	@Before
	public void atStart() {
		studentBean = new StudentBean();
		addStudentService = new AddStudentService();
	}

	@Test
	public void testAddStudentService() {

		int id = 16;
		String name = "Selena";
		String gender = "Male";
		String course = "BCA";
		String email = "selena@gmail.com";
		int phone = 1234;
		String username = "selena";
		String password = "selena";

		studentBean.setId(id);
		studentBean.setName(name);
		studentBean.setGender(gender);
		studentBean.setCourse(course);
		studentBean.setEmail(email);
		studentBean.setPhone(phone);
		studentBean.setUsername(username);
		studentBean.setPassword(password);

		assertEquals(true, addStudentService.addStudent(studentBean));
	}

	@After
	public void atEnd() {
		studentBean = null;
		addStudentService = null;
	}
	
}
