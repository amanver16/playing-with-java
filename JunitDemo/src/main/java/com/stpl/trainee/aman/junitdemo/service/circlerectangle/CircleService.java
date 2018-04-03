package com.stpl.trainee.aman.junitdemo.service.circlerectangle;

/* ################### */
/* Author : AMAN VERMA */
/* ################### */

public class CircleService {

	private float radius;

	// Getter Method
	public float getRadius() {
		return radius;
	}

	// Setter Method
	public void setRadius(float radius) {
		this.radius = radius;
	}

	// Calculate Area Service Method
	public float calculateCircleAreaService() {

		return 3.14f * radius * radius;
	}

	// Calculate Circumference Service Method
	public float calculateCircleCircumferenceService() {

		return 2 * 3.14f * radius;
	}
}