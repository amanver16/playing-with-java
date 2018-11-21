package com.stpl.trainee.aman.assignment3.studentrepository.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stpl.trainee.aman.assignment3.studentrepository.service.StudentService;
import com.stpl.trainee.aman.assignment3.studentrepository.service.bean.StudentBean;

import static org.junit.Assert.*;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class StudentServiceTest {

	private StudentService studentRecord;
	private StudentBean studentRepositoryBean;

	@Before
	public void atStart() {
		
		studentRecord = new StudentService();
		studentRepositoryBean = new StudentBean();
	}

	// Method to test delete student service
	@Test
	public void testDeleteStudentService() {

		studentRepositoryBean.setStudentId(1);
		studentRepositoryBean.setStudentName("Anil");
		studentRecord.addStudentService(studentRepositoryBean);
		assertEquals(true, studentRecord.deleteStudentService(studentRepositoryBean.getStudentId()));
	}

	// Method to test delete student service negative
	@Test
	public void testDeleteStudentService2() {
		assertEquals(true, studentRecord.deleteStudentService(4));
	}

	@After
	public void atEnd() {
		studentRecord = null;
	}

}
