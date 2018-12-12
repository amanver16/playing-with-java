package com.aman.solid.sports;

public class Swimming implements Athlete, Swimmers {

	@Override
	public String swim() {
		return "in swimming.";
	}

	@Override
	public String compete(String atheleteName) {
		return atheleteName + " started competing ";
	}

}
