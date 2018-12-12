package com.aman.solid.shape;

/**
 * @author aman.verma
 *
 */

public class Rectangle implements ShapeArea {

	private int height;
	private int width;

	@Override
	public double calculateArea() {
		return this.getHeight() * this.getWidth();
	}

	// Getters and Setters

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
