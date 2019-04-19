import java.time.LocalDate;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;

public class Club {

	private String name;
	private String league;
	private LocalDate established;
	
	private Map<Integer, Player> playerQualif = new TreeMap<>();

	public Club(String name, String league, LocalDate established) {
		this.name = name;
		this.league = league;
		this.established = established;
	}
	
	public void addPlayerQualif(Player newPlayer) {
		if(!playerQualif.containsKey(newPlayer.getId())){
			playerQualif.put(newPlayer.getId(), newPlayer);
			newPlayer.setCurrentClub(this);
		}	
	}
	
	public Player findPlayerQualif(Integer id) throws Exception{
		if(!playerQualif.containsKey(id)) {
			throw new Exception("There is no that player");
		}
		return playerQualif.get(id);		
	}
	
	public void clearConnections() {
		playerQualif.clear();
	}
	
	public Collection<Player> getPlayers(){
		return playerQualif.values();
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getEstablished() {
		return established;
	}
	
	@Override
	public String toString() {
		String toReturn = "Club name: " + name + "\nLeague: "+ league +"\nPlayers:";
		if(playerQualif.values().size() == 0) {
			toReturn += " no players";
		}
		for (Player player : playerQualif.values()) {
			toReturn += "\n" + player;
		}
		return toReturn;		
	}
}
