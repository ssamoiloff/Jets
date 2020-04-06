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
		return "Model:\t" + getModel() + "\nSpeed:\t" + getSpeed() + "\nRange:\t" + getRange()
				+ "\nPrice:\t$" + getPrice();
	}
	
}
