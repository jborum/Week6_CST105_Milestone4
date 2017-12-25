/**
 * Program: NFLPlayer File: 
 * NFLPlayer.java Summary: 
 * Programs creates a Defensive Player by extending the NFLPlayer class.
 * Author: Jason E. Borum 
 * Date: December 24, 2017
 **/

public class DefensivePlayer extends NFLPlayer { //Beginning of defensive player class
	private int sacks; // Player sacks
	private int tackles; // Player tackles
	private int interceptions; // Player interceptions
	private int fumbleRecoveries; // Player fumble recoveries
	
	public DefensivePlayer() { // Defensive player constructor
		super(); // Call constructor from super class
	}
	
	// Call constructor with arguments
	public DefensivePlayer(String cplayerNameFirst, String cplayerNameLast, String cplayerCollege,
			String cplayerPosition, double cplayerHeight, double cplayerWeight, String cplayerBirthDate, int cplayerAge,
			double cplayer40yardDash, double cplayerVerticalJump, int sacks, int tackles, int interceptions, int fumbleRecoveries) {
		
		// call super class constructor
		super(cplayerNameFirst, cplayerNameLast, cplayerCollege, cplayerPosition, cplayerHeight, cplayerWeight,
				cplayerBirthDate, cplayerAge, cplayer40yardDash, cplayerVerticalJump);
		
		this.fumbleRecoveries = fumbleRecoveries; // Passing fumbleRecoveries to constructor
		this.tackles = tackles; // Passing tackles to constructor
		this.sacks = sacks; // Passing sacks to constructor
		this.interceptions = interceptions; // Passing interceptions to constructor
		
	}


	public int getSacks() {
		return sacks;
	} // getSacks method

	public void setSacks(int sacks) {
		this.sacks = sacks;
	}// set method

	public int getTackles() {
		return tackles;
	} // getTackles method

	public void setTackles(int tackles) {
		this.tackles = tackles;
	}// setTackles method

	public int getInterceptions() {
		return interceptions;
	}// getInterceptions method

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	} // setInterceptions method

	public double getFumbleRecoveries() {
		return fumbleRecoveries;
	}// getFumbleRecoveries method

	public void setFumbleRecoveries(int fumbleRecoveries) {
		this.fumbleRecoveries = fumbleRecoveries;
	} // setFumbleRecoveries method

	// Override toString method from super class
	@Override
	public String toString() {
		return "DefensivePlayer [getPlayerNameFirst()=" + getPlayerNameFirst() + ", getPlayerNameLast()="
				+ getPlayerNameLast() + ", getPlayerNameFull()=" + getPlayerNameFull() + ", getPlayerCollege()="
				+ getPlayerCollege() + ", getPlayerPosition()=" + getPlayerPosition() + ", getPlayerHeight()="
				+ getPlayerHeight() + ", getPlayerWeight()=" + getPlayerWeight() + ", getPlayerBirthDate()="
				+ getPlayerBirthDate() + ", getPlayerAge()=" + getPlayerAge() + ", getPlayerBodyMassIndex()="
				+ getPlayerBodyMassIndex() + ", getPlayer40yardDash()=" + getPlayer40yardDash()
				+ ", getPlayerVerticalJump()=" + getPlayerVerticalJump() + ", sacks=" + sacks + ", tackles=" + tackles
				+ ", interceptions=" + interceptions + ", fumbleRecoveries=" + fumbleRecoveries + "]";
	} //End of toString method

} //End of Defensive Player Class
