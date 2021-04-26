package week2.les02.opdracht4;
import java.util.ArrayList;

public class Main {
	public static void main(String[] arg){
		ArrayList<Huisdier> lijst = new ArrayList<Huisdier>();

		Huisdier h1 = new Huisdier("Bello", "Straathond");
		h1.setGewicht(3.0);

		Huisdier h2 = new Huisdier("cello", "Pitbull"); 
		h2.setGewicht(5.0);
		
		Huisdier h3 = new Huisdier("Steven", "Rotweiler");
		h3.setGewicht(12.0); 

		Huisdier h4 = new Huisdier("Lady", "Rotweiler");


		lijst.add(h1);
		lijst.add(h2);
		lijst.add(h3);
		lijst.add(2, h4);
		lijst.get(2).setGewicht(30.0);
		
		System.out.println("Er zijn: " + lijst.size() + " Huisdieren.");
		for (Huisdier dier : lijst){
			System.out.println(dier);
		}
	}
}