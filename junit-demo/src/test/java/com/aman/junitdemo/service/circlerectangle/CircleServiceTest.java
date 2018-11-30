package com.aman.junitdemo.service.circlerectangle;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class CircleServiceTest {

	private CircleService circle;

	@Before
	public void initial() {
		circle = new CircleService();
	}

	// Circle Area Service Test Method
	@Test
	public void testArea() {

		circle.setRadius(3.00f);
		assertEquals(28.26f, circle.calculateCircleAreaService(), 00.00);
	}

	// Circle Circumference Service Test Method
	@Test
	public void testCircumference() {

		circle.setRadius(3.0f);
		assertEquals(18.84f, circle.calculateCircleCircumferenceService(), 00.00);
	}

	@After
	public void end() {
		circle = null;
	}
}
