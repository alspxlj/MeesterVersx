package week1.les02.opdracht1;

public class Piloot{
	String naam;
	double salaris;
	int vlieguren;

	public Piloot(String naam){
		this.naam = naam;
	}

	public String getNaam(){
		return naam;
	}

	public double getSalaris(){
		return salaris;
	}

	public int getVlieguren(){
		return vlieguren;
	}

	public void setSalaris(double salaris){
		this.salaris = salaris;
	}

	public void verhoogVliegurenMet(int vlieguren){
		this.vlieguren = vlieguren;
	}

	public String toString(){
		String pilootString = naam + " heeft " + vlieguren + " gemaakt en verdient " + salaris;
		return pilootString;
	}
}