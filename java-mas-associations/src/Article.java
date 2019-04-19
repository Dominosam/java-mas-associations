import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Article {
	private String name;
	private String content;
	private String author;
	
	private Transfer transfer;
	
	private Article(String name, String content, String author, Transfer transfer) {
		this.content = content;
		this.author = author;
		this.transfer = transfer;
		this.name = name;
	}
	
	public static Article createArticle(Transfer transfer, String name, String content, String author) throws Exception {
		if (transfer == null) {
			throw new Exception("Transfer does not exist!");
		}
		
		Article article = new Article(name, content, author, transfer);
	
		transfer.addArticle(article);
		
		return article;
	}
	
	@Override
	public String toString() {
		return "Article '" + name + "' by " + author  + "\n" + content;
	}
	
}
