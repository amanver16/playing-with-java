package com.aman.solid.shape;

/**
 * @author aman.verma
 *
 */

public class Circle implements ShapeArea {

	private double radius;

	@Override
	public double calculateArea() {
		double pi = Math.PI;
		return pi * this.getRadius() * this.getRadius();
	}

	// Getter Setter
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}