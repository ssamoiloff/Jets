package com.skilldistillery.jets;

import java.util.Scanner;

public class JetsApplication {

	private AirField airField;
	private static Scanner kb = new Scanner(System.in);
	
	public static void main(String[] args) {
		JetsApplication ja = new JetsApplication();
		ja.launch();
		
		kb.close();
	}
	
	public void launch() {
		airField = new AirField();
		airField.populateField();
		printHeader();
		menuLogic();
	}
	
	public void printHeader() {
		System.out.println(" _______________________________________________ ");
		System.out.println("|***********************************************|");
		System.out.println("|**                                           **|");
		System.out.println("|**         Welcome to the Air Field!         **|");
		System.out.println("|**                                           **|");
		System.out.println("|***********************************************|");
		System.out.println(" ----------------------------------------------- ");
		System.out.println();
	}
	
	public void printMenu() {
		System.out.println("1. List fleet");
		System.out.println("2. Fly all jets");
		System.out.println("3. View fastest jet");
		System.out.println("4. View jet with longest range");
		System.out.println("5. Load all Cargo Jets");
		System.out.println("6. Dogfight!");
		System.out.println("7. Add a jet to Fleet");
		System.out.println("8. Remove a jet from Fleet");
		System.out.println("9. Quit");
		System.out.println();
	}
	
	public void menuLogic() {
		int selection = 0;
		while (selection != 9) {
			printMenu();
			System.out.print("> ");
			selection = kb.nextInt();
			
			switch (selection) {
			case 1:
				printJets();
				break;
			case 2:
				flyAllJets();
				break;
			case 3:
				findFastest();
				break;
			case 4:
				findLongest();
				break;
			case 5:
				loadCargo();
				break;
			case 6:
				dogfight();
				break;
			case 7:
				addJet();
				break;
			case 8:
				removeJet();
				break;
			case 9:
				System.exit(0);
			}
		}
	}
	
	public void printJets() {
		for (Jet jet : airField.getJetsList()) {
			System.out.println(jet);
			System.out.println();
		}
	}
	
	public void flyAllJets() {
		for (int jet = 0; jet < airField.getJetsList().size(); jet++) {
			airField.getJetsList().get(jet).fly();
		}
	}
	
	public void findFastest() {
		double fastest = 0.0;
		int fastestJetIndex = 0;
		for (int jet = 0; jet < airField.getJetsList().size(); jet++) {
			if (fastest < airField.getJetsList().get(jet).getSpeed()) {
				fastest = airField.getJetsList().get(jet).getSpeed();
				fastestJetIndex = jet;
			}
		}
		System.out.println("\t\t---FASTEST JET---");
		System.out.println(airField.getJetsList().get(fastestJetIndex));
		System.out.println();
	}
	
	public void findLongest() {
		int longest = 0;
		int longestJetIndex = 0;
		for (int jet = 0; jet < airField.getJetsList().size(); jet++) {
			if (longest < airField.getJetsList().get(jet).getRange()) {
				longest = airField.getJetsList().get(jet).getRange();
				longestJetIndex = jet;
			}
		}
		System.out.println("\t\t---LONGEST RANGE---");
		System.out.println(airField.getJetsList().get(longestJetIndex));
		System.out.println();
	}
	
	public void loadCargo() {
		for (int jet = 0; jet < airField.getJetsList().size(); jet++) {
			if (airField.getJetsList().get(jet) instanceof CargoCarrier) {
				System.out.print("\t\t" + airField.getJetsList().get(jet).getModel());
				((CargoPlane) airField.getJetsList().get(jet)).loadCargo();
			}
		}
		System.out.println("\t\tLet's get these to where they need to go!\n");
	}
	
	public void dogfight() {
		for (int jet = 0; jet < airField.getJetsList().size(); jet++) {
			if (airField.getJetsList().get(jet) instanceof CombatReady) {
				System.out.print("\t\t" + airField.getJetsList().get(jet).getModel());
				((FighterJet) airField.getJetsList().get(jet)).fight();
			}
		}
		System.out.println("\t\tGIVE 'EM HELL, BOYS!!!\n");
	}
	
	public void addJet() {
		int selection = 0;
		String type = null;
		do {
			System.out.println("\t\tChoose a type of jet");
			System.out.println("1. Cargo");
			System.out.println("2. Fighter");
			System.out.println("3. Passenger");
			System.out.println("4. Actually...nevermind (exit)");
			System.out.println();
			System.out.print(">> ");
			selection = kb.nextInt();
			
			switch (selection) {
			case 1:
				type = "CargoPlane";
//				selection = 4;
				break;
			case 2:
				type = "FighterJet";
//				selection = 4;
				break;
			case 3:
				type = "Passenger";
//				selection = 4;
				break;
			}
			break;
		} while (selection != 4);
		
		String model = null;
		double speed = 0.0;
		int range = 0;
		long price = 0;
		
		if (selection != 4) {
			System.out.println();
			System.out.print("Enter Model: ");
			kb.nextLine();
			model = kb.nextLine();
			System.out.print("Enter Speed (in MPH): ");
			speed = kb.nextDouble();
			System.out.print("Enter Range: ");
			range = kb.nextInt();
			System.out.print("Enter Price: ");
			price = kb.nextLong();
			System.out.println();
		}
		
		if (selection == 1) {
			airField.addNewCargo(model, speed, range, price);
		}
		if (selection == 2) {
			airField.addNewFighter(model, speed, range, price);
		}
		if (selection == 3) {
			airField.addNewPassenger(model, speed, range, price);
		}
		System.out.println();
	}
	
	public void removeJet() {
		int index = 0;
		int selection = 0;
		System.out.println("\tWhich jet would you like to remove?\n");
		
		for (int jet = 0; jet < airField.getJetsList().size(); jet++) {
			System.out.println((jet+1) + ") " + airField.getJetsList().get(jet));
			System.out.println();
		}
		System.out.print("> ");
		selection = kb.nextInt();
		
		if (!(selection > airField.getJetsList().size()) && selection != 0) {
			airField.getJetsList().remove(selection-1);
			System.out.println();
		} else {
			while (selection == 0 || selection > airField.getJetsList().size()) {
				System.out.println("\nPlease select a valid jet #");
				System.out.print("> ");
				selection = kb.nextInt();
			}
			airField.getJetsList().remove(selection-1);
			System.out.println();
		}
	}
}