package com.aman.log4j2;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class Fibonacci {

	private long parameter;

	public Fibonacci(int parameter) {
		this.parameter = parameter;
	}

	//Fibonacci Series Generator Method
	public long[] generateFibonacciSeries() {

		long first = 0;
		long second = 1;
		long sum = 0;
		int i = 3;
		long[] fibonacciSeriesArray = new long[50];
		int fibonacciSeriesArrayIndex = 0;

		fibonacciSeriesArray[fibonacciSeriesArrayIndex] = first;
		fibonacciSeriesArray[fibonacciSeriesArrayIndex + 1] = second;
		fibonacciSeriesArrayIndex = 2;

		while (i <= parameter) {

			sum = first + second;
			fibonacciSeriesArray[fibonacciSeriesArrayIndex] = sum;
			first = second;
			second = sum;
			i++;
			fibonacciSeriesArrayIndex++;
		}

		return fibonacciSeriesArray;
	}
}
