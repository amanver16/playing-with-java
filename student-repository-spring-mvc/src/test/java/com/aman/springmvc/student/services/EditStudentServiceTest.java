package com.aman.springmvc.student.services;

import static org.junit.Assert.assertEquals;

import com.aman.springmvc.student.bean.StudentBean;
import com.aman.springmvc.student.service.EditStudentService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EditStudentServiceTest {

	private StudentBean studentBean;
	private EditStudentService editStudentService;

	@Before
	public void atStart() {
		studentBean = new StudentBean();
		editStudentService = new EditStudentService();
	}

	@Test
	public void testAddStudentService() {

		int id = 16;
		String name = "Selena";
		String gender = "FeMale";
		String course = "MCA";
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

		assertEquals(true, editStudentService.updateStudent(studentBean));
	}

	@After
	public void atEnd() {
		studentBean = null;
		editStudentService = null;
	}

}
