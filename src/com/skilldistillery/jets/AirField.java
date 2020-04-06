package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AirField {

	private ArrayList<Jet> jetsList;

	public AirField() {
		jetsList = new ArrayList<Jet>();
	}

	public void populateField() {
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			String line;
			Jet newJet = null;
			while ((line = bufIn.readLine()) != null) {
				String[] plane = line.split(",");
				String currentType = plane[0];
				String currentModel = plane[1];
				double currentSpeed = Double.parseDouble(plane[2].trim());
				int currentRange = Integer.parseInt(plane[3].trim());
				long currentPrice = Long.parseLong(plane[4].trim());
				if (plane[0].equals("CargoPlane")) {
					newJet = new CargoPlane(currentModel, currentSpeed, currentRange, currentPrice);
					jetsList.add(newJet);
				}
				else if (plane[0].equals("Passenger")) {
					newJet = new Passenger(currentModel, currentSpeed, currentRange, currentPrice);
					jetsList.add(newJet);
				}
				else if (plane[0].equals("FighterJet")) {
					newJet = new FighterJet(currentModel, currentSpeed, currentRange, currentPrice);
					jetsList.add(newJet);
				}
				else {
					newJet = new JetImpl(currentModel, currentSpeed, currentRange, currentPrice);
					jetsList.add(newJet);
				}
			}
		} catch (IOException e) {
			System.err.println(e);
		}
	}

	public ArrayList<Jet> getJetsList() {
		return jetsList;
	}

	public void setJetsList(ArrayList<Jet> jetsList) {
		this.jetsList = jetsList;
	}
	
}
