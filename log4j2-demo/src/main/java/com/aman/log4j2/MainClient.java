package com.aman.log4j2;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

class MainClient {

	private static final Logger mainClientLogger = LogManager.getLogger(MainClient.class);
	private static final Scanner inputScanner = new Scanner(System.in);

	// Main Method
	public static void main(String[] args) {

		MainClient client = new MainClient();

		mainClientLogger.info("\n1. Fibonacci Series.\n2. Prime Number.\n3. Circle and Rectangle.\n");
		mainClientLogger.info("Enter your choice : ");

		int choice = inputScanner.nextInt();

		switch (choice) {

		case 1:
			client.callFibonacciService();
			break;

		case 2:
			client.callPrimeService();
			break;

		case 3:
			client.callCircleRectangleService();
			break;

		default:
			mainClientLogger.info("\nInvalid Choice!!!");
		}

		inputScanner.close();
	}

	// Fibonacci Service Caller Method
	public void callFibonacciService() {

		Fibonacci fibonacci = new Fibonacci(50);
		long[] fibonacciSeriesArray = fibonacci.generateFibonacciSeries();

		mainClientLogger.info("\nDisplaying fibonacci series :");

		for (int index = 0; index < fibonacciSeriesArray.length; index++) {
			mainClientLogger.info("[" + (index + 1) + "] : " + fibonacciSeriesArray[index]);
		}
	}

	// Prime Service Caller Method
	public void callPrimeService() {

		long number;
		Prime prime;

		mainClientLogger.info("\nEnter any number : ");
		number = inputScanner.nextInt();
		prime = new Prime(number);

		if (prime.primeCheck()) {
			mainClientLogger.info("\n" + number + " is a Prime Number.");
		} else {
			mainClientLogger.info("\n" + number + " is not a Prime Number.");
		}
	}

	// Circle Rectangle Service Caller Method
	public void callCircleRectangleService() {

		mainClientLogger.info("\nEnter radius of the circle : ");
		float radius = inputScanner.nextFloat();
		CircleRect circle = new CircleRect(radius);

		mainClientLogger.info("\nArea of the circle is : " + circle.calculateCircleArea());
		mainClientLogger.info("\nCircumference of the circle is : " + circle.calculateCircleCircumference());

		mainClientLogger.info("\nEnter length and breadth of the rectangle : ");
		int length = inputScanner.nextInt();
		int breadth = inputScanner.nextInt();
		CircleRect rectangle = new CircleRect(length, breadth);

		mainClientLogger.info("\nArea of the rectangle is : " + rectangle.calculateRectangleArea());
		mainClientLogger.info("\nCircumference of the rectangle is : " + rectangle.calculateRectangleCircumference());
	}
}