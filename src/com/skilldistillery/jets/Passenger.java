package com.skilldistillery.jets;

public class Passenger extends Jet implements TransportReady {
	
	public Passenger() {}
	
	public Passenger(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void playMovie() {
		
	}

	@Override
	public String toString() {
		return "Passenger [getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
}
