
public class NFLPlayerDriver {

	public static void main(String[] args) { //Start of main method
		createAPlayer(); // Call createAPlayer method
	} // End of Main method
	
	public static void createAPlayer() { // Start createAPlayer method
		// Declare defensive and offensive players
		DefensivePlayer player1 = new DefensivePlayer("Myles", "Garrett", "Texas A&M", "DE", 76, 272, "12/19/1995", 22, 4.64, 41.0, 10, 52,1,4);
		OffensivePlayer player2 = new OffensivePlayer("Mitchell", "Trubisky", "North Carolina", "QB", 74, 222, "8/20/1994", 23,
				4.25, 27.5, 3422.0, 35.7,0.0,2);
		DefensivePlayer player3 = new DefensivePlayer("Solomon", "Thomas", "Standard", "DE", 75, 273, "8/26/1995", 22, 4.69, 35.0, 6, 45, 0, 2);
		OffensivePlayer player4 = new OffensivePlayer("Leonard", "Fournette", "LSU", "RB", 72, 240, "1/18/1995", 22, 4.51, 28.5, 0, 1105.0, 173.0, 12);
		OffensivePlayer player5 = new OffensivePlayer("Corey", "Davis", "Western Michigan", "WR", 75, 209, "1/11/1995", 22, 4.38,
				36.2, 0, 0, 875.0, 6);
		DefensivePlayer player6 = new DefensivePlayer("Jamal", "Adams", "LSU", "S", 72, 214, "10/17/95", 22, 4.56, 31.5, 0 ,12, 3, 2);

		// Initialize player manager class
		NFLPlayerManager playerDraft = new NFLPlayerManager();

		// Add players to the draft
		playerDraft.addnflPlayer(player1.toString());
		playerDraft.addnflPlayer(player2.toString());
		playerDraft.addnflPlayer(player3.toString());
		playerDraft.addnflPlayer(player4.toString());
		playerDraft.addnflPlayer(player5.toString());
		playerDraft.addnflPlayer(player6.toString());

		//Print number of players in the draft
		System.out.println("Number of players in draft: " + playerDraft.getNumberOfnflPlayers());
		
		// Add players in player draft to string array
		String[] playersArray = playerDraft.getnflPlayers();
		int x = 1;
		for (int i = 0; i < playerDraft.getNumberOfnflPlayers(); i++) { // start of loop
			System.out.println(x++ + " - " + playersArray[i] + ", "); // print values of the players array
		} // End of For Loop
	} // End of createAPlayer method
} // End of NFLPlayerDriver
