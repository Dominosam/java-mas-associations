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
	//private static Set<Article> allArticles = new HashSet<>();
	
	public void addArticle(Article article) throws Exception {
		if(!articles.contains(article)) {
			articles.add(article);
		}
	}
	
	
	public Transfer(int fee, LocalDate date, String newClub) {
		this.fee = fee;
		this.date = date;
		this.newClub = newClub;
	}
	
	
	public void setPlayer(Player player) {
		if(this.player != null) {
			player.clearTransferConnections();
		}
		
		if(this.player != player) {
			this.player = player;
			player.addTransfer(this);
		}
	}
	
	public String toString() {
		String info =  newClub + " new tranfser! :"
				+ "\n Fee: " + fee + "; date: " + date + "; Player: " + player 
				+ "\n Availble articles: ";
		
		for (Article article : articles) {
			info += article;
		}
		
		return info;
	
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
