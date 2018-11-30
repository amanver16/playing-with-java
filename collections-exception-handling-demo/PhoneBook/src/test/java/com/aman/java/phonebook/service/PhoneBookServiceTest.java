package com.aman.java.phonebook.service;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class PhoneBookServiceTest {

	private PhoneBookService phoneRecord;

	@Before
	public void atStart() {
		phoneRecord = new PhoneBookService();
	}

	// Test Delete Phone Record Service Method
	@Test
	public void testDeletePhoneRecordService() {

		String name = "Aman";
		int number = 1234;
		phoneRecord.addPhoneRecordService(name, number);
		assertEquals(true, phoneRecord.deletePhoneRecordService(name));
	}

	// Test Query Phone Record Service Method
	@Test
	public void testQueryPhoneRecordService() {

		String name = "Aman";
		int number = 1234;
		phoneRecord.addPhoneRecordService(name, number);
		assertEquals(true, phoneRecord.queryPhoneRecordService(name));
	}

	@After
	public void atEnd() {
		phoneRecord = null;
	}

}
