import java.time.LocalDate;

public class Main {

	  public static void main(String[] args){
	  
		  Player cristianoRonaldo = new Player(0,"Cristiano", "Ronaldo", 100000000, DominantFoot.Right, 0, 0);
		  Player lukaModric = new Player(1,"Luka", "Modric", 80000000, DominantFoot.Right, 0, 0);
		  Player sergioRamos = new Player(2,"Sergio", "Ramos", 60000000, DominantFoot.Right, 0, 0);
		  Player lionelMessi = new Player(3, "Lionel", "Messi", 100000000, DominantFoot.Left, 0, 0);
		  
		  Club realMadrid = new Club("Real Madrid", "La Liga", LocalDate.of(1902, 3, 6));
		
		  System.out.println("///QUALIFIED");
		  System.out.println(realMadrid.toString());		  
		  realMadrid.addPlayerQualif(cristianoRonaldo);
		  realMadrid.addPlayerQualif(lukaModric);
		  realMadrid.addPlayerQualif(sergioRamos);
		  		  
		  System.out.println(realMadrid.toString());
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
		 
		  System.out.println(cristianoToJuve);
		  cristianoRonaldo.showTransfers();
		  
		 
	  }
}
