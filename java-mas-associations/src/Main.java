import java.time.LocalDate;

public class Main {

	  public static void main(String[] args) throws Exception{
	  
		  Player cristianoRonaldo = new Player(0,"Cristiano", "Ronaldo", 100000000, DominantFoot.Right, 0, 0);
		  Player lukaModric = new Player(1,"Luka", "Modric", 80000000, DominantFoot.Right, 0, 0);
		  Player sergioRamos = new Player(2,"Sergio", "Ramos", 60000000, DominantFoot.Right, 0, 0);
		  Player lionelMessi = new Player(3, "Lionel", "Messi", 100000000, DominantFoot.Left, 0, 0);
		  
		  Club realMadrid = new Club("Real Madrid", "La Liga", LocalDate.of(1902, 3, 6));
		
		  System.out.println("///QUALIFIED");
		  System.out.println("//before");
		  System.out.println(realMadrid.toString());	
		  
		  realMadrid.addPlayerQualif(cristianoRonaldo);
		  realMadrid.addPlayerQualif(lukaModric);
		  realMadrid.addPlayerQualif(sergioRamos);
		  
		  System.out.println("Find Ronaldo in RM: " + realMadrid.findPlayerQualif(cristianoRonaldo.getId()));
		  //System.out.println("Find Messi in RM:" + realMadrid.findPlayerQualif(lionelMessi.getId()));
		  
		  System.out.println("//after");
		  		  
		  System.out.println(realMadrid.toString());
		  System.out.println("Klub Ronaldo: " + cristianoRonaldo.getCurrentClub());
		  System.out.println();
		  
		  
		  System.out.println("///WITH ATTRIBUTE");
		  
		  Match realBarca = new Match(LocalDate.of(2018, 10, 15),"2:1","Real Madrid", "FC Barcelona");
		  MatchStats statsRealBarca = new MatchStats(realBarca, 11, 1);
		  
		  statsRealBarca.addPlayer(cristianoRonaldo);
		  statsRealBarca.addPlayer(sergioRamos);
		  statsRealBarca.addPlayer(lionelMessi);
		 
		  System.out.println(statsRealBarca);
		  
		  
		 
		  System.out.println("///ASSOCIATION");
		  Transfer cristianoToJuve = new Transfer(110000000, LocalDate.of(2018, 07, 15), "Juventus");
		  cristianoRonaldo.addTransfer(cristianoToJuve);
		  Transfer crisitanoToInter = new Transfer(1500000000, LocalDate.of(2018, 07, 15), "Inter");
		  cristianoRonaldo.addTransfer(crisitanoToInter);
		  
		 
		  System.out.println("//Transfer side");
		  System.out.println(cristianoToJuve);
		  System.out.println("//Player side");
		  cristianoRonaldo.showTransfers();
		  

		  System.out.println("///COMPOSITION");
		  Transfer sergioToManUtd = new Transfer(80000000, LocalDate.of(2018, 07, 15), "Manchester Utd");
		  sergioToManUtd.setPlayer(sergioRamos);
		  
		  Article.createArticle(sergioToManUtd, "Sergio to Man Utd??", "Lorum Ipsum", "Jacek Gmoch");
		  System.out.println(sergioToManUtd);
		  
		  System.out.println(sergioRamos);
		  
		  Transfer messiToCity = new Transfer(10000000,  LocalDate.of(2018, 07, 15), "Manchester City");
		  lionelMessi.addTransfer(messiToCity);
		  System.out.println(lionelMessi);
		  System.out.println(messiToCity);
		 
	  }
}
