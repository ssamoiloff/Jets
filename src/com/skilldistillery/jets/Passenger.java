package com.skilldistillery.jets;

public class Passenger extends Jet implements TransportReady {

	public Passenger() {
	}

	public Passenger(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	public void playMovie() {

	}
	
	public void fly() {
		super.fly();
		System.out.println("\t\t*** SIR PLEASE COVER YOUR MOUTH WHEN YOU COUGH ***");
		System.out.println();
	}

	@Override
	public String toString() {
		return "\t\tType:\tPASSENGER" + "\n\t\tModel:\t" + getModel() + "\n\t\tSpeed:\t" + getSpeed() + "\n\t\tRange:\t" + getRange()
				+ "\n\t\tPrice:\t$" + getPrice();
	}

}
