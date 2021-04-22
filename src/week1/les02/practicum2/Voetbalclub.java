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

	public int getAantalGewonnen() {
		return aantalGewonnen;
	}

	public void setAantalGewonnen(int aantalGewonnen) {
		this.aantalGewonnen = aantalGewonnen;
	}

	public int getAantalVerloren() {
		return aantalVerloren;
	}

	public void setAantalVerloren(int aantalVerloren) {
		this.aantalVerloren = aantalVerloren;
	}

	public char getCh() {
		return ch;
	}

	public void setCh(char ch) {
		this.ch = ch;
	}

	public String getClubNaam() {
		return clubNaam;
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
	}

	public int aantalGespeeld(){
		int totaleGespeeldeWedstrijden = aantalGewonnen + aantalVerloren + aantalGelijk;
		return totaleGespeeldeWedstrijden;
	}

	public int aantalPunten(){
		int gewonnenPunten = aantalGewonnen * 3;
		int gelijkPunten = aantalGelijk * 1;
		totalePunten = totalePunten + gewonnenPunten + gelijkPunten;
		return totalePunten;
	}

	public String toString(){
		String Voetbalclub = clubNaam +"   " + totaleGespeeldeWedstrijden +"      " + aantalGewonnen + "   " + aantalGelijk + "   " + aantalVerloren + "     " + totalePunten;
		return Voetbalclub;
	}
}