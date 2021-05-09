package testhotelapp;

import java.util.ArrayList;

public class TestHotel {
	
	public void testHotel() {
		Hotel hotel1 = new Hotel("Avondrood");
		System.out.println(hotel1 + "\n");
		
		System.out.println("alle kamertypen"); 
		//alle Kamertypen printen
		ArrayList<KamerType> ktList = hotel1.getKamerTypen(); 
		for (KamerType kt : ktList) {
			System.out.println(kt); 
		}

		System.out.println("\nalle kamers"); 
		//alle Kamers printen
		ArrayList<Kamer> kList = hotel1.getAlleKamers(); 
		for (Kamer kamer : kList) {
			System.out.println(kamer); 
		}

	}
	
}
