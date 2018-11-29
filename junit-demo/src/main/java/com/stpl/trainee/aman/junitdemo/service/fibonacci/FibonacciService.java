package com.stpl.trainee.aman.junitdemo.service.fibonacci;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class FibonacciService {

	private long parameter;	
	
	//Getter Method
	public long getParameter() {
		return parameter;
	}

	//Setter Method
	public void setParameter(long parameter) {
		this.parameter = parameter;
	}

	//Fibonacci Series Generator Service Method
	public long[] generateFibonacciSeriesService() {

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
