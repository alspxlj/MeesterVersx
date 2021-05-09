package week5.les10.practicum8_3;

public class Klant {
	private String naam;
	private String adres;

	public Klant(String nm, String adr) {
		naam = nm;
		adres = adr;
	}

	public String toString() {
		return naam + " met adres: " + adres;
	}
}

