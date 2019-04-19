import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Article {
	private String name;
	private String content;
	private String author;
	
	private Transfer transfer;
	
	public Article(String name, String content, String author, Transfer transfer) {
		this.content = content;
		this.author = author;
		this.transfer = transfer;
	}
	
	@Override
	public String toString() {
		return "Article '" + name + "' by " + author + " about transfer "
	+ transfer.getPlayer()  + " in " + transfer.getNewClub() + "\n" + content;
	}
	
}
