package com.stpl.trainee.aman.springrest.webservice.services;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RemoveStudentServiceTest {

	private RemoveStudentService removeStudentServiceTest;

	@Before
	public void atStart() {
		removeStudentServiceTest = new RemoveStudentService();
	}

	@Test
	public void testRemoveStudentService() {
		int id = 70;
		assertEquals(true, removeStudentServiceTest.removeStudentService(id));
	}

	@After
	public void atEnd() {
		removeStudentServiceTest = null;
	}

}
