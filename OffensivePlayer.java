/**
 * Program: NFLPlayer File: 
 * NFLPlayer.java Summary: 
 * Programs creates a Offensive Player by extending the NFLPlayer class.
 * Author: Jason E. Borum 
 * Date: December 24, 2017
 **/

public class OffensivePlayer extends NFLPlayer { // Beginning of OffensivePlayer class
	
	// Declaring NFL Player Instance Variables
	public double passingYards; // Player passing yards
	public double rushingYards; // Player rushing yards
	public double receivingYards; // Player receiving yards
	public int touchdowns; // Player touchdowns

	// Initialize constructor without arguments
	public OffensivePlayer() {
		super(); // Call constructor from superclass
	}

	// Initialize constructor with arguments from super class
	public OffensivePlayer(String cplayerNameFirst, String cplayerNameLast, String cplayerCollege,
			String cplayerPosition, double cplayerHeight, double cplayerWeight, String cplayerBirthDate, int cplayerAge,
			double cplayer40yardDash, double cplayerVerticalJump, double passingYards, double rushingYards, double receivingYards, int touchdowns) {
		
		// Call constructor from superclass with arguments
		super(cplayerNameFirst, cplayerNameLast, cplayerCollege, cplayerPosition, cplayerHeight, cplayerWeight,
				cplayerBirthDate, cplayerAge, cplayer40yardDash, cplayerVerticalJump);
		
		this.passingYards = passingYards;  // Passing passing yards to constructor
		this.rushingYards = rushingYards; // Passing rushing yards to constructor
		this.receivingYards = receivingYards; // Passing receiving yards to constructor
		this.touchdowns = touchdowns; // Passing touchdowns to constructor
	}

	 //return the passingYards
	public double getPassingYards() {
		return passingYards;
	}

	 // passingYards method
	public void setPassingYards(double passingYards) {
		this.passingYards = passingYards;
	}

	 //return the rushingYards
	public double getRushingYards() {
		return rushingYards;
	}

	// rushingYards method
	public void setRushingYards(double rushingYards) {
		this.rushingYards = rushingYards;
	}

	 // return the recievingYards
	public double getRecievingYards() {
		return receivingYards;
	}

	// recievingYards methods
	public void setRecievingYards(double recievingYards) {
		this.receivingYards = recievingYards;
	}

	//return the touchdowns
	public double getTouchdowns() {
		return touchdowns;
	}

	// set touchdowns method
	public void setTouchdowns(int touchdowns) {
		this.touchdowns = touchdowns;
	}

	// Override toString method from super class
	@Override
	public String toString() {
		return "OffensivePlayer [getPlayerNameFirst()=" + getPlayerNameFirst() + ", getPlayerNameLast()="
				+ getPlayerNameLast() + ", getPlayerNameFull()=" + getPlayerNameFull() + ", getPlayerCollege()="
				+ getPlayerCollege() + ", getPlayerPosition()=" + getPlayerPosition() + ", getPlayerHeight()="
				+ getPlayerHeight() + ", getPlayerWeight()=" + getPlayerWeight() + ", getPlayerBirthDate()="
				+ getPlayerBirthDate() + ", getPlayerAge()=" + getPlayerAge() + ", getPlayerBodyMassIndex()="
				+ getPlayerBodyMassIndex() + ", getPlayer40yardDash()=" + getPlayer40yardDash()
				+ ", getPlayerVerticalJump()=" + getPlayerVerticalJump() + ", passingYards=" + passingYards
				+ ", rushingYards=" + rushingYards + ", receivingYards=" + receivingYards + ", touchdowns=" + touchdowns
				+ "]";
	} // End of toString method
} // end of Offensive Player class
