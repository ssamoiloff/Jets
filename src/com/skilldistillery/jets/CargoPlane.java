package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {}
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void loadCargo() {
		
	}

	@Override
	public String toString() {
		return "\t\tModel:\t" + getModel() + "\n\t\tSpeed:\t" + getSpeed() + "\n\t\tRange:\t" + getRange()
				+ "\n\t\tPrice:\t$" + getPrice();
	}
	
}
