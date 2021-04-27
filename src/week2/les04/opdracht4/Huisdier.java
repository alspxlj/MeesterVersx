package week2.les04.opdracht4;

public class Huisdier {
	private String naam; 
	private String ras; 
	private double gewicht;

	public Huisdier(String nm, String r) {
		naam = nm; 
		ras = r; 
		gewicht = 0.0; 
	}

	public String getNaam(){
		return naam;
	}

	public String getRas(){
		return ras;
	}

	public double getGewitcht(){
		return gewicht;
	}

	public void setGewicht(double gewicht){
		this.gewicht = gewicht;
	}

	public String toString() {
		return naam + ", de " + ras + ", weegt " + gewicht + " kg."; 
	} 
}