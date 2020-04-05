package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {}
	
	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void fight() {
		
	}

	@Override
	public String toString() {
		return "FighterJet [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
}