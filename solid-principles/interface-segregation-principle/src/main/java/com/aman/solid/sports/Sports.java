package com.aman.solid.sports;

public class Sports {

	public static void main(String[] args) {

		Jumping jumping = new Jumping();
		System.out.println("Jumping tournament has been started.");
		System.out.println(jumping.compete("Aman") + jumping.longJump());

		Racing racing = new Racing();
		System.out.println("Racing tournament has been started.");
		System.out.println(racing.compete("Aman") + racing.sprint());

		Swimming swimming = new Swimming();
		System.out.println("Swimming tournament has been started.");
		System.out.println(swimming.compete("Aman") + swimming.swim());

	}
}
