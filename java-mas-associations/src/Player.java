


public class Player {
	
	private int id;
	private String name;
	private String surname;
	private float marketValue;
	private DominantFoot dominantFoot;
	private int yellowCards;
	private int redCards;
	private Club currentClub;
	private int scoredGoals;
	private MatchStats playerInMatch;
	
	public Player(int id,String name, String surname, float marketValue, DominantFoot dominantFoot, int yellowCards,
			int redCards)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.marketValue = marketValue;
		this.dominantFoot = dominantFoot;
	}
	
	public int getId() {
		return id;
	}
	
	public void setCurrentClub(Club club) {
		currentClub = club;
	}
	
	@Override
	public String toString() {
		return name + " " + surname + "\n";
	}
	
	public void addYellowCards(int yellowCards) {
		this.yellowCards += yellowCards;
	}
	
	public void addRedCards(int redCards) {
		this.redCards += redCards;
	}
	
	public void addScoredGoals(int scoredGoals) {
		this.scoredGoals += scoredGoals;
	}

	public void setPlayerInMatch(MatchStats playerInMatch) {
		this.playerInMatch = playerInMatch;			
	}
	
}
