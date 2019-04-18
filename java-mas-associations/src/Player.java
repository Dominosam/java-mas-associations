


public class Player {
	
	private int id;
	private String name;
	private String surname;
	private float marketValue;
	private DominantFoot dominantFoot;
	private int yellowCards;
	private int redCards;
	private Club currentClub;
	private NationalTeam nationalTeam = null;
	
	public Player(int id,String name, String surname, float marketValue, DominantFoot dominantFoot, int yellowCards,
			int redCards)
	{
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.marketValue = marketValue;
		this.dominantFoot = dominantFoot;
		this.yellowCards = yellowCards;
		this.redCards = redCards;
	}
	
	public int getId() {
		return id;
	}
	
	public void setCurrentClub(Club club) {
		currentClub = club;
	}
	
	@Override
	public String toString() {
		return name + " " + surname;
	}
	
}
