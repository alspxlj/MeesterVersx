package week1.les02.practicum1;

public class Zwembad {
	private double breedte;
	private double lengte;
	private double diepte;

	public Zwembad(double breedte, double lengte, double diepte){
		this.breedte = breedte;
		this.lengte = lengte;
		this.diepte = diepte;
	}

	public Zwembad() {
		
	}

	public double getBreedte() {
		return breedte;
	}

	public void setBreedte(double breedte) {
		this.breedte = breedte;
	}

	public double getLengte() {
		return lengte;
	}

	public void setLengte(double lengte) {
		this.lengte = lengte;
	}

	public double getDiepte() {
		return diepte;
	}

	public void setDiepte(double diepte) {
		this.diepte = diepte;
	}

	public double inhoud(){
		double inhoud = breedte * lengte * diepte;
		return inhoud;
	}

	public String toString(){
		String zwembadString = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep";
		return zwembadString; 
	}
}