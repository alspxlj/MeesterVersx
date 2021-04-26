package week1.les02.practicum2;

public class Voetbalclub {
	private String clubNaam;
	private int aantalGewonnen;
	private int aantalVerloren;
	private int aantalGelijk;
	private int totaleGespeeldeWedstrijden;
	private int totalePunten;
	private char ch;

	public Voetbalclub(String clubNaam){
		this.clubNaam = clubNaam;
	}

	public void verwerkResultaat(char ch) { 
		if (ch == 'w') {
			aantalGewonnen = aantalGewonnen + 1;
		}
		if (ch == 'g') {
			aantalGelijk = aantalGelijk + 1;
		}
		
		if (ch == 'v') { 
			aantalVerloren = aantalVerloren + 1; 
		}
		totaleGespeeldeWedstrijden = aantalGewonnen + aantalVerloren + aantalGelijk;
		totalePunten = (aantalGewonnen * 3) + (aantalGelijk * 1);
	}

	public String toString(){
		String Voetbalclub = clubNaam +"   " + totaleGespeeldeWedstrijden +"      " + aantalGewonnen + "   " + aantalGelijk + "   " + aantalVerloren + "     " + totalePunten;
		return Voetbalclub;
	}
}