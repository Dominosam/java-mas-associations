import java.util.ArrayList;
import java.util.List;

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
	
	private MatchStats matchStats;
	private List<Transfer> transfers = new ArrayList<Transfer>();
	
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
	
	public void addTransfer(Transfer tranfser) {
		if(!transfers.contains(tranfser)) {
			transfers.add(tranfser);
		}
		
		tranfser.setPlayer(this);
	}
	
	public void clearTransferConnections() {
		transfers.clear();
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
	

	public void setMatchStats(MatchStats matchStats) {
		if(this.matchStats != null) {
			matchStats.clearPlayerConnections();
			this.matchStats = matchStats;			
			matchStats.addPlayer(this);
		}else {
			this.matchStats = matchStats;
		}
		
	}
	

	public void showTransfers() {
		System.out.println(this);
		for (Transfer transfer : transfers) {
			System.out.println(transfer.getNewClub() + " " + transfer.getDate() 
			+ "; fee: " + transfer.getFee());
		}
	}
	
}
