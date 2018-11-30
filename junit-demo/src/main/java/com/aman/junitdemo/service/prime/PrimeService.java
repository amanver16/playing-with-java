package com.aman.junitdemo.service.prime;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class PrimeService {

	private long number;

	//Getter Method
	public long getNumber() {
		return number;
	}

	//Setter Method
	public void setNumber(long number) {
		this.number = number;
	}

	//PrimeChecker Service Method
	public boolean primeCheckService() {

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
