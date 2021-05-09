package week4.les08.opdracht8_4;

public abstract class AbstractDier implements Dier {
	protected int aantalPoten;

	//constructor chaining binnen de klasse 
	public AbstractDier() {
		this(0);
	} 
	public AbstractDier(int aantalPoten) {
		this.aantalPoten = aantalPoten;
	}

	//twee methoden van interface Dier 	
	public int getAantalPoten() {
		return aantalPoten;
	}
	public void setAantalPoten(int aantalPoten) {
		this.aantalPoten = aantalPoten;
	}
	
	//abstracte methode speak()
	public abstract String speak();
	
	//overriding 
	public String toString() {
		return "aantalPoten: " + aantalPoten;
	} 	
}


