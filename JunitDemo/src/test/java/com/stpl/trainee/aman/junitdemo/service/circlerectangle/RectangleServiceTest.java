package com.stpl.trainee.aman.junitdemo.service.circlerectangle;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.stpl.trainee.aman.junitdemo.service.circlerectangle.RectangleService;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class RectangleServiceTest {

	private RectangleService rectangle;

	@Before
	public void initial() {
		rectangle = new RectangleService();
	}

	// Rectangle Area Service Test Method
	@Test
	public void testCalculateRectangleAreaService() {

		rectangle.setLength(3);
		rectangle.setBreadth(4);
		assertEquals(12, rectangle.calculateRectangleAreaService());
	}

	//// Rectangle Circumference Service Test Method
	@Test
	public void testCalculateRectangleCircumferenceService() {

		rectangle.setLength(3);
		rectangle.setBreadth(4);
		assertEquals(24, rectangle.calculateRectangleCircumferenceService());
	}

	@After
	public void end() {
		rectangle = null;
	}
}
