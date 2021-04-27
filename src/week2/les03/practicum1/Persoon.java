package week2.les03.practicum1;

public class Persoon {
	private String naam;
	private int leeftijd;

	public Persoon(String nm, int lft){
		naam = nm;
		leeftijd = lft;
	}

	public String toString(){
		String message = "en heeft huisbaas " +naam+ "; leeftijd " +leeftijd+ " jaar";
		return message;
	}
}