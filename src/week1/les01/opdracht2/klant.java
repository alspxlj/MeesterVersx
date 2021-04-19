package week1.les01.opdracht2;

public class klant {
	String naam;
	String adres;
	String plaats;
	
	//Constructor
	public klant(String naam, String adres, String plaats) {
		this.naam = naam;
		this.adres = adres;
		this.plaats = plaats;
	}
	
	public String getNaam() {
		return naam;
	}
	
	public String getAdres() {
		return adres;
	}
	
	public String getPlaats() {
		return plaats;
	}

	public void setAdres(String adres){
		this.adres = adres;
	}

	public void setPlaats(String plaats){
		this.plaats = plaats;
	}
	
	public String toString() {
		String klant_string = naam + " woont op " + adres + " in " + plaats;
		return klant_string;
	}
}