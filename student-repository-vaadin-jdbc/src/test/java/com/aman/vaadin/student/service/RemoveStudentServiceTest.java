package com.aman.vaadin.student.service;

import static org.junit.Assert.assertEquals;

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