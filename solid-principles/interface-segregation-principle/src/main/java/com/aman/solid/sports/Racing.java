package com.aman.solid.sports;

public class Racing implements Athlete, Racers {

	@Override
	public String relayRace() {
		return "in relay racing.";
	}

	@Override
	public String sprint() {
		return "in sprint.";
	}

	@Override
	public String fourHunderedMeters() {
		return "in 400 meters race.";
	}

	@Override
	public String eightHundredMeters() {
		return "in 800 meters race.";
	}

	@Override
	public String compete(String atheleteName) {
		return atheleteName + " strated competing ";
	}

}
