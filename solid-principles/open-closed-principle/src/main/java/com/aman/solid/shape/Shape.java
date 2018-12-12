package com.aman.solid.shape;

/**
 * @author aman.verma
 *
 */

public class Shape {

	public static void main(String[] args) {

		Circle circle = new Circle();
		circle.setRadius(13.5);
		System.out.println("The Area of the Circle is : " + circle.calculateArea());

		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(50);
		rectangle.setWidth(65);
		System.out.println("The area of rectangle is : " + rectangle.calculateArea());

	}
}