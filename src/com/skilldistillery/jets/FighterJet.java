package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {

	}

	@Override
	public String toString() {
		return "\t\tModel:\t" + getModel() + "\n\t\tSpeed:\t" + getSpeed() + "\n\t\tRange:\t" + getRange()
				+ "\n\t\tPrice:\t$" + getPrice();
	}

}
