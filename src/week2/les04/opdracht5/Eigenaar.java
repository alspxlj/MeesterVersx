package week2.les04.opdracht5;
import java.util.*;

public class Eigenaar { 
	private String naam; 
	private int giroNr; 
	private ArrayList<Huisdier> beesten;

	public Eigenaar(String nm) { 
		naam = nm;
		beesten = new ArrayList<Huisdier>();
	} 

	public void setHuisdier(Huisdier dier){
		beesten.add(dier);
	}

	public ArrayList<Huisdier> getHuisdieren(){
		return beesten;
	}

	public String toString() {
		String message = "De Eigenaar: " + naam;
		if (beesten.size() == 0) {
		 	message = message + " Heeft geen huisdieren.";
		 }else{
			message = message + " zijn huisdieren: \n";
		 	for (Huisdier beest : beesten){
		 		message = message + beest;
		 	}
		 }
		return message;
	} 
}