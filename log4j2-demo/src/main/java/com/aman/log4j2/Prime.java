package com.aman.log4j2;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class Prime {

	private long number;

	public Prime(long number) {
		this.number = number;
	}

	//PrimeChecker Method
	public boolean primeCheck() {

		long i = 2;

		while (i <= number / 2) {

			if (number % i == 0) {
				return false;
			}

			i++;
		}

		return true;
	}
}
