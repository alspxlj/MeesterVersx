package week4.les08.opdracht8_5;

public class Hamster extends AbstractDier{
	private String naam; 
	
	//constructor chaining met superklasse 
	public Hamster(String naam) {
		super(4);
		this.naam = naam;
	}
	
	//twee methoden uit beide interfaces 	
	public String getNaam() {
		return naam;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	
	//methode uit interface Huisdier 
	public String spelen() {
		return "Ja, graag!"; 
	}

	//implementatie van in superklasse abstracte methode 
	public String speak() {
		return "Piep!"; 
	}

	//overriding 
	public String toString() {
		return "Hamster [naam=" + naam + " met " + aantalPoten + 
		" Poten ]";
	}
}



