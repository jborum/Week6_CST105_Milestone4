import java.util.Arrays;

public class NFLPlayerManager {
	private String[] nflPlayers = new String[100];
	private int numberOfnflPlayers;

	public void addnflPlayer(String nflPlayer) {// Start of addnflPlayer method
		nflPlayers[numberOfnflPlayers] = nflPlayer;
		numberOfnflPlayers++;
	} // End of addnflPlayer method

	public String[] getnflPlayers() {// Start of getnflPlayers method
		return nflPlayers;
	} // End of getnflPlayers method

	public int getNumberOfnflPlayers() { // Start of getNumberOfnflPlayers method
		return numberOfnflPlayers;
	} // End of getNumberOfnflPlayers method

	// toString Method
	@Override
	public String toString() { // Start of toString Method
		return "nflplayermanager [nflPlayers=" + Arrays.toString(nflPlayers) + ", numberOfnflPlayers="
				+ numberOfnflPlayers + "]";
	} // End of toString method
		
} // End of NFLPlayerManager Class
