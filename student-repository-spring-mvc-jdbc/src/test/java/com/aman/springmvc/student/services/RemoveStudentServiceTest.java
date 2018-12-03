package com.aman.springmvc.student.services;

import static org.junit.Assert.assertEquals;

import com.aman.springmvc.student.service.RemoveStudentService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RemoveStudentServiceTest {

	private RemoveStudentService removeStudentService;

	@Before
	public void atStart() {
		removeStudentService = new RemoveStudentService();
	}

	@Test
	public void testRemoveStudentService() {
		int id = 16;
		assertEquals(true, removeStudentService.removeStudent(id));
	}

	@After
	public void atEnd() {
		removeStudentService = null;
	}

}