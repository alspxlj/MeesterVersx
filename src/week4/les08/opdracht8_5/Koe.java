package week4.les08.opdracht8_5;

public class Koe extends AbstractDier{
	private String naam; 
	private int wekenDrachtig;
	private double litersMelk;
	
	//constructor chaining met superklasse 
	public Koe(String naam) {
		super(4);
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

	// nieuwe methode 
	public void setWekenDrachtig(int wekenDrachtig) {
		this.wekenDrachtig = wekenDrachtig;
	}

	// nieuwe methode
	public void setLitersMelk(double lit){
		this.litersMelk = lit;
	}

	//implementatie van in superklasse abstracte methode 
	public String speak() {
		return "Mooee!"; 
	}

	//overriding 
	public String toString() {
		return "Koe [naam=" + naam + " met " + aantalPoten + 
		" Poten, wekenDrachtig: " + wekenDrachtig + "]";
	}
}



