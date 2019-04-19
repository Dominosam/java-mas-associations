import java.util.ArrayList;
import java.util.List;

public class MatchStats {
	private int scoredGoals;
	private int yellowCards;
	private int redCards;
	private Match match;
	
	
	public MatchStats(Match match, int yellowCards, int redCards) {
		this.yellowCards = yellowCards;
		this.redCards = redCards;
		this.match = match;		
		calculateScoredGoals();
		match.setPlayerInMatch(this);
	}


	private List<Player> players = new ArrayList<>();
//	private List<Match> matches;
	
	
	public void calculateScoredGoals() {
		String[] goals = match.getResult().split(":");
		this.scoredGoals = Integer.parseInt(goals[0]) + Integer.parseInt(goals[1]);
	}
	
	
	public void addPlayer(Player player) {
		if(!players.contains(player)) {
			players.add(player);
		}
		
		player.setMatchStats(this);
	}
	
	public void clearPlayerConnections() {
		players.clear();
	}
	
//	public void addMatch(Match match) {
//		if(!matches.contains(match)) {
//			matches.add(match);
//		}
//		
//		match.setPlayerInMatch(this);
//	}
	
	public void setMatch(Match match) {
		this.match = match;
	}
	
	
	@Override
	public String toString() {
		String info = match + "\nscored goals: " + scoredGoals 
				+ "\nyellow cards: " + yellowCards + "\nred cards: " 
				+ redCards + "\nPlayers in match:\n";
	
		for (Player player : players) {
			info += player;
		}
		
		return info;
		
	}
	
	
	
	
}
