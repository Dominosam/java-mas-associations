import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transfer {
	private int fee;
	private LocalDate date;
	private String newClub;
	
	private Player player;
	
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
}
