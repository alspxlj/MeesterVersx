package week3.les06.practicum2;
import java.time.LocalDate;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Game {
	private String naam;
	private int releaseJaar;
	private double nieuwprijs;

	public Game(String nm, int rJ, double nwpr){
		naam = nm;
		releaseJaar = rJ;
		nieuwprijs = nwpr;
	}

	public String getNaam(){
		return naam;
	}

	public double huidigeWaarde(){
		int huidigeJaar = LocalDate.now().getYear();
		int leeftijd = (huidigeJaar - releaseJaar);
		double prijs = nieuwprijs;
		DecimalFormat tweeDecimaal = new DecimalFormat("#.00");
		tweeDecimaal.setRoundingMode(RoundingMode.CEILING);

		for(int i=1; i<=leeftijd; i++){
			prijs = prijs - ((prijs / 100) * 30);
		}
		return prijs;
	}

	public boolean equals(Object andereObject) { 
		boolean gelijkeObjecten = false; 

		if (andereObject instanceof Game) { 
			Game andereGame = (Game) andereObject; 

		if (this.naam.equals(andereGame.naam) && 
			this.releaseJaar == andereGame.releaseJaar &&
			this.nieuwprijs == andereGame.nieuwprijs) { 

			gelijkeObjecten = true; 
		} 
	} 
	return gelijkeObjecten; 
}

public String toString(){
	String message = "          "+naam + " uitgegeven op: " + releaseJaar + " nieuwprijs: �" + nieuwprijs + " en nu voor: �" + huidigeWaarde() + "\n";
	return message;
}
}