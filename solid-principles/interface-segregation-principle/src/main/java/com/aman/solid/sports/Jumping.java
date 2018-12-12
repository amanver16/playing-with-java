package com.aman.solid.sports;

public class Jumping implements Athlete, Jumpers {

	@Override
	public String longJump() {
		return "in long jump.";
	}

	@Override
	public String highJump() {
		return "in high jump.";
	}

	@Override
	public String compete(String atheleteName) {
		return atheleteName + " started competing ";
	}

}
