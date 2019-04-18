import java.time.LocalDate;

public class Main {

	  public static void main(String[] args){
	  
		  Player cristianoRonaldo = new Player(0,"Cristiano", "Ronaldo", 100000000, DominantFoot.Right, 0, 0);
		  Player lukaModric = new Player(1,"Luka", "Modric", 80000000, DominantFoot.Right, 0, 0);
		  Player sergioRamos = new Player(2,"Sergio", "Ramos", 60000000, DominantFoot.Right, 0, 0);
		  
		  
		  Club realMadrid = new Club("Real Madrid", "La Liga", LocalDate.of(1902, 3, 6));
		
		  System.out.println(realMadrid.toString());
		  
		  realMadrid.addPlayerQualif(cristianoRonaldo);
		  realMadrid.addPlayerQualif(lukaModric);
		  realMadrid.addPlayerQualif(sergioRamos);
		  		  
		  System.out.println(realMadrid.toString());
		  System.out.println();
	  }
}
