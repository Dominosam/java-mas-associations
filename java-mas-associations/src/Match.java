import java.time.LocalDate;

public class Match {

	private LocalDate date;
	private String result;
	private String winner;
	private String loser;
	private MatchStats playerInMatch;
	
	public Match(LocalDate date, String result, String winner, String loser) {
		this.date = date;
		this.result = result;
		this.winner = winner;
		this.loser = loser;
	}
	
	public void setPlayerInMatch(MatchStats playerInMatch) {
		this.playerInMatch = playerInMatch;
	}
	
	@Override
	public String toString() {
		String info = "Match between:" + winner + " " + loser 
				+ " with score " + result;
		
		return info;
				
	}
	
	public String getResult() {
		return result;
	}
					
}
