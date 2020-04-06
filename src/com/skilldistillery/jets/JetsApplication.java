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
	
	public void printJets() {
		for (Jet cJet : airField.getJetsList()) {
			System.out.println(cJet);
			System.out.println();
		}
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
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				System.exit(0);
			}
		}
	}
}
