package week2.les01.opdracht1;

public class Huisdier {
	private String naam; 
	private String ras; 
	private double gewicht;
	private Eigenaar baasje; 

	public Huisdier(String nm, String r) {
		naam = nm; 
		ras = r; 
		gewicht = 0.0; 
	}

	public Eigenaar getBaasje() {
		return baasje;
	}

	public void setBaasje(Eigenaar baas){
		baasje = baas;
	}

	public String toString() {
		return naam + ", de " + ras + ", weegt " + gewicht + " kg."; 
	} 
}