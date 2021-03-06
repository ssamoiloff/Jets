package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier {

	public CargoPlane() {}
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}
	
	public void loadCargo() {
		System.out.println("....LOADING CARGO\n");
	}
	
	public void fly() {
		super.fly();
		System.out.println("\t\t*** It's not flashy, but it's honest work ***");
		System.out.println();
	}
	
	public double getSpeed() {
		return super.speed;
	}

	@Override
	public String toString() {
		return "\t\tType:\tCARGO" + "\n\t\tModel:\t" + getModel() + "\n\t\tSpeed:\t" + getSpeed() + "\n\t\tRange:\t" + getRange()
				+ "\n\t\tPrice:\t$" + getPrice();
	}
	
}
