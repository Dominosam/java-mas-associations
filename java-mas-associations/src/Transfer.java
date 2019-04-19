import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Transfer {
	private int fee;
	private LocalDate date;
	private String newClub;
	
	private Player player;
	
	private List<Article> articles = new ArrayList<>();
	private static Set<Article> allArticles = new HashSet<>();
	
	public void addArticle(Article article) throws Exception {
		if(!articles.contains(article)) {
			throw new Exception("There is already that aricle");
		}
		
		articles.add(article);
		allArticles.add(article);
	}
	
	
	public Transfer(int fee, LocalDate date, String newClub) {
		this.fee = fee;
		this.date = date;
		this.newClub = newClub;
	}
	
	public void setPlayer(Player player) {
		if(this.player != null && this.player != player) {
			player.clearTransferConnections();
			this.player = player;
			player.addTransfer(this);
		}else {
			this.player = player;
		}
	}
	
	public String toString() {
		return  newClub + " new tranfser! :"
				+ "\n Fee: " + fee + "; date: " + date + "; Player: " + player;
	}

	public int getFee() {
		return fee;
	}

	public LocalDate getDate() {
		return date;
	}

	public String getNewClub() {
		return newClub;
	}
	
	public Player getPlayer() {
		return player;
	}
}
