package com.aman.log4j2;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class CircleRect {

	private int rectangleLength;
	private int rectangleBreadth;
	private float circleRadius;

	public CircleRect(int rectangleLength, int rectangleBreadth) {
		this.rectangleLength = rectangleLength;
		this.rectangleBreadth = rectangleBreadth;
	}

	public CircleRect(float circleRadius) {
		this.circleRadius = circleRadius;
	}

	// Circle Area Calculator Method
	public float calculateCircleArea() {
		return (float) (3.14 * circleRadius * circleRadius);
	}

	// Circle Circumference Calculator Method
	public float calculateCircleCircumference() {
		return (float) (2 * 3.14 * circleRadius);
	}

	// Rectangle Area Calculator Method
	public int calculateRectangleArea() {
		return rectangleLength * rectangleBreadth;
	}

	// Rectangle Circumference Calculator Method
	public int calculateRectangleCircumference() {
		return 2 * (rectangleLength + rectangleBreadth);
	}
}
