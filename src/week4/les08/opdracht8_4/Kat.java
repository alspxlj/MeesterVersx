package week4.les08.opdracht8_4;

public class Kat extends AbstractDier implements Boerderijdier, Huisdier {
	private String naam; 
	private int wekenDrachtig;
	
	//constructor chaining met superklasse 
	public Kat(String naam) {
		super(4);
		this.naam = naam;
		wekenDrachtig = 0; 
	}
	
	//implementatie van in superklasse abstracte methode 
	public String speak() {
		return "Miauw!"; 
	}

	//twee methoden uit beide interfaces 	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	//methode uit interface Boerderijdier
	public int getWekenDrachtig() {
		return wekenDrachtig;
	}

	//methode uit interface Huisdier 
	public String spelen() {
		return "Ja, graag!"; 
	}

	// nieuwe methode 
	public void setWekenDrachtig(int wekenDrachtig) {
		this.wekenDrachtig = wekenDrachtig;
	} 

	//overriding 
	public String toString() {
		return "Kat [naam=" + naam + " met " + aantalPoten + 
				" Poten, wekenDrachtig: " + wekenDrachtig + "]";
	}
}



