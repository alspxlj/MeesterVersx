package testhotelapp;

public class Hotel {
	private String naam;
	private ArrayList<Boeking> alleBoekingen;
	private ArrayList<Kamer> alleKamers;
	private ArrayList<KamerTypen> allekamerTypen;


	public Hotel(String nm){
		naam = nm;
	}

	public int voegBoekingToe(LocalDate van, LocalDate tot, String nm, String adr, KamerTypen kt){

	}

	public ArrayList<KamerTypen> getKamerTypen(){
		return allekamerTypen;
	}

	public String toString(){
		String message = "naam " + naam;
		return message;
	}
}