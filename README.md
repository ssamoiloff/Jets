# Week 3 Skill Distillery - Jets Project


### Overview
This program is a simple emulation of an airfield where users may view current jets in the fleet and their info, as well as add custom jets.

As per usual, the user is greeted with a banner and a menu:

	 _______________________________________________ 
	|***********************************************|
	|**                                           **|
	|**         Welcome to the Air Field!         **|
	|**                                           **|
	|***********************************************|
	 ----------------------------------------------- 
	
	1. List fleet
	2. Fly all jets
	3. View fastest jet
	4. View jet with longest range
	5. Load all Cargo Jets
	6. Dogfight!
	7. Add a jet to Fleet
	8. Remove a jet from Fleet
	9. Quit

Selecting option #1 presents the user with a list of current jets on the airfield:

	> 1
			Type:	CARGO
			Model:	C-130
			Speed:	368.0
			Range:	2361
			Price:	$30000000
	
			Type:	CARGO
			Model:	C-5 Galaxy
			Speed:	579.0
			Range:	7273
			Price:	$262750000
	
			Type:	PASSENGER
			Model:	Boeing 777
			Speed:	644.0
			Range:	9845
			Price:	$320200000
	
			Type:	PASSENGER
			Model:	Boeing 737
			Speed:	564.0
			Range:	4400
			Price:	$82000000
	
			Type:	FIGHTER
			Model:	FA-18
			Speed:	1190.0
			Range:	500
			Price:	$70500000
	
			Type:	FIGHTER
			Model:	F-22
			Speed:	1500.0
			Range:	1839
			Price:	$150000000

Selecting option #2 simulates the jets taking off and once again displays their stats, along with their max flight time based on their max range and speed, and also displays a custom message for each type of jet:

	> 2
			--NOW FLYING--
			Type:	CARGO
			Model:	C-130
			Speed:	368.0
			Range:	2361
			Price:	$30000000
			Max flight time: 6.415760869565218 hours
			*** It's not flashy, but it's honest work ***
	
			--NOW FLYING--
			Type:	CARGO
			Model:	C-5 Galaxy
			Speed:	579.0
			Range:	7273
			Price:	$262750000
			Max flight time: 12.561312607944732 hours
			*** It's not flashy, but it's honest work ***
	
			--NOW FLYING--
			Type:	PASSENGER
			Model:	Boeing 777
			Speed:	644.0
			Range:	9845
			Price:	$320200000
			Max flight time: 15.287267080745341 hours
			*** SIR PLEASE COVER YOUR MOUTH WHEN YOU COUGH ***
	
			--NOW FLYING--
			Type:	PASSENGER
			Model:	Boeing 737
			Speed:	564.0
			Range:	4400
			Price:	$82000000
			Max flight time: 7.801418439716312 hours
			*** SIR PLEASE COVER YOUR MOUTH WHEN YOU COUGH ***
	
			--NOW FLYING--
			Type:	FIGHTER
			Model:	FA-18
			Speed:	1190.0
			Range:	500
			Price:	$70500000
			Max flight time: 0.42016806722689076 hours
			*** PUTTING WARHEADS ON FOREHEADS ***
	
			--NOW FLYING--
			Type:	FIGHTER
			Model:	F-22
			Speed:	1500.0
			Range:	1839
			Price:	$150000000
			Max flight time: 1.226 hours
			*** PUTTING WARHEADS ON FOREHEADS ***

Selecting option #3 displays the current fastest jet in the fleet:

	> 3
			---FASTEST JET---
			Type:	FIGHTER
			Model:	F-22
			Speed:	1500.0
			Range:	1839
			Price:	$150000000

Selecting option #4 displays the current jet with the longest range:

	> 4
			---LONGEST RANGE---
			Type:	PASSENGER
			Model:	Boeing 777
			Speed:	644.0
			Range:	9845
			Price:	$320200000

Selecting option #5 simulates loading all cargo jets:

	> 5
			C-130....LOADING CARGO
	
			C-5 Galaxy....LOADING CARGO
	
			Let's get these to where they need to go!

Selecting option #6 displays a cheesy simulation of the fighter jets dogfighting:

	> 6
			FA-18....FIRING HEAT SEEKERS PEW PEW PEW
	
			F-22....FIRING HEAT SEEKERS PEW PEW PEW
	
			GIVE 'EM HELL, BOYS!!!

Selecting option #7 gives the user the option to add a new jet to the fleet, and first displays a menu prompting which type of jet they would like to add. After a choice is made, the user is then prompted to enter all the fields of the jet (if they choose option #4, the are returned to the main menu):

	> 7
			Choose a type of jet
	1. Cargo
	2. Fighter
	3. Passenger
	4. Actually...nevermind (exit)
	
	>> 2
	
	Enter Model: F-35
	Enter Speed (in MPH): 1200
	Enter Range: 1367
	Enter Price: 122000000

Selecting option #8 presents the user with the option to delete a jet, and prompts them to make a selection from the current jets on the airfield:

	> 8
	Which jet would you like to remove?
	
	1) 	Type:	CARGO
			Model:	C-130
			Speed:	368.0
			Range:	2361
			Price:	$30000000
	
	2) 	Type:	CARGO
			Model:	C-5 Galaxy
			Speed:	579.0
			Range:	7273
			Price:	$262750000
	
	3) 	Type:	PASSENGER
			Model:	Boeing 777
			Speed:	644.0
			Range:	9845
			Price:	$320200000
	
	4) 	Type:	PASSENGER
			Model:	Boeing 737
			Speed:	564.0
			Range:	4400
			Price:	$82000000
	
	5) 	Type:	FIGHTER
			Model:	FA-18
			Speed:	1190.0
			Range:	500
			Price:	$70500000
	
	6) 	Type:	FIGHTER
			Model:	F-22
			Speed:	1500.0
			Range:	1839
			Price:	$150000000
	
	7) 	Type:	FIGHTER
			Model:	F-35
			Speed:	1200.0
			Range:	1367
			Price:	$122000000
	
	> 7

And finally, selecting option #9 exits the program.

### Technologies Used
- Java SE13
- Eclipse IDE
- MacOS Terminal
- GitHub/Git

### Lessons Learned
* A deeper understanding of Abstraction and Inheritance has been gained in this project. Through repetition, trial and error, and sheer will, I can now say that I mostly know what's going on.


* A huge personal lesson here has been to take the time I estimate a project to take and double it. There will always be setbacks and roadblocks to overcome, which will significantly extend the amount of time it takes to complete a project.


* If one doesn't intend to fully implement certain classes in their program, it's better to leave them out (oops).


* A final lesson added at the very end of typing up this readme: as my projects become more complex, it's probably wiser to leave out a step-by-step walkthrough of the program. I'm sure you had to do a lot of scrolling to get here. Thanks for coming to my TED Talk!