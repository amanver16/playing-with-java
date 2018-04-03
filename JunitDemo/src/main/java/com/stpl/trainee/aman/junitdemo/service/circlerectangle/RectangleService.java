package com.stpl.trainee.aman.junitdemo.service.circlerectangle;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class RectangleService {

	private int length;
	private int breadth;

	// Length Getter Method
	public int getLength() {
		return length;
	}

	// Length Setter Method
	public void setLength(int length) {
		this.length = length;
	}

	// Breadth Getter Method
	public int getBreadth() {
		return breadth;
	}

	// Breadth Setter Method
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	// Calculate Rectangle Area Service Method
	public int calculateRectangleAreaService() {

		return length * breadth;
	}

	// Calculate Rectangle Circumference Service Method
	public int calculateRectangleCircumferenceService() {

		return 2 * (length * breadth);
	}

}
