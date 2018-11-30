package com.aman.junitdemo.service.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class FibonacciServiceTest {

	private FibonacciService fibonacci;

	@Before
	public void initial() {
		fibonacci = new FibonacciService();
	}

	// Testing positive tests
	@Test
	public void testGenerateFibonacciSeriesService1() {

		fibonacci.setParameter(50);
		long[] arr = fibonacci.generateFibonacciSeriesService();
		long[] test = { 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 };

		for (int i = 0; i < test.length; i++) {
			assertEquals(test[i], arr[i]);
		}
	}

	// Testing negative tests
	@Test
	public void testGenerateFibonacciSeriesService2() {

		fibonacci.setParameter(50);
		long[] arr = fibonacci.generateFibonacciSeriesService();
		long[] test = { 0, 1, 3, 9, 11, 15, 28, 43, 61, 84 };

		for (int i = 0; i < test.length; i++) {
			assertEquals(test[i], arr[i]);
		}
	}

	@After
	public void end() {
		fibonacci = null;
	}
}
