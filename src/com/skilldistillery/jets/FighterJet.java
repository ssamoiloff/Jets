package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	public FighterJet() {
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void fight() {
		System.out.println("....FIRING HEAT SEEKERS PEW PEW PEW\n");
	}
	
	public void fly() {
		super.fly();
		System.out.println("\t\t*** PUTTING WARHEADS ON FOREHEADS ***");
		System.out.println();
	}

	@Override
	public String toString() {
		return "\t\tType:\tFIGHTER" + "\n\t\tModel:\t" + getModel() + "\n\t\tSpeed:\t" + getSpeed() + "\n\t\tRange:\t" + getRange()
				+ "\n\t\tPrice:\t$" + getPrice();
	}

}
