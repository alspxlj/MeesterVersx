package testhotelapp;

import java.time.LocalDate;

public class TestHotelBoeking {
	
	public void testen() {
	    Hotel h = new Hotel("Avondrood");

	    LocalDate van = LocalDate.of(2018, 6, 18);
	    LocalDate tot = LocalDate.of(2018, 6, 23);

	    System.out.println("Eerste Boeking"); 
	    KamerType kt = h.getKamerTypen().get(0); // eerste type in lijst
	    int nr = h.voegBoekingToe(van, tot, "Jaap de Vries", "Plein 9, Utrecht", kt);

	    if (nr != -1) {
	      System.out.println("Boeking krijgt kamernummer: " + nr + "\n");
	    } else {
	      System.out.println("Er is helaas geen kamer beschikbaar\n");
	    }

/*	    System.out.println("Tweede Boeking"); 
	    kt = h.getKamerTypen().get(2); // deerde type in lijst
	    nr = h.voegBoekingToe(van, tot, "Kees Meijer", "Dalton 200, Utrecht", kt);

	    if (nr != -1) {
	      System.out.println("Boeking krijgt kamernummer: " + nr + "\n");
	    } else {
	      System.out.println("Er is helaas geen kamer beschikbaar\n");
	    }
*/	    
	    System.out.println(h.toString());

	}

}
