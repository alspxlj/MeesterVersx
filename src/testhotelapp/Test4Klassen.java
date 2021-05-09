package testhotelapp;

import java.time.LocalDate;

public class Test4Klassen {

	public void testKlant() {
		Klant klant1 = new Klant("Hans de Vries", "Utrecht");
		System.out.println(klant1 + "\n");
	}
	
	public void testKamerType() {
		KamerType kt1 = new KamerType("DZ met douche", 2, 100.0); 
		System.out.println(kt1 + "\n");		
	}

	public void testKamer() {
		KamerType kt1 = new KamerType("DZ met douche", 2, 100.0); 
		Kamer  kamer1 = new Kamer(200, kt1, false); 
		System.out.println(kamer1 + "\n");		
	}

	public void testBoeking() {
		KamerType kt1 = new KamerType("DZ met douche", 2, 100.0); 
		Kamer  kamer1 = new Kamer(200, kt1, false); 
		Klant  klant1 = new Klant("Hans de Vries", "Utrecht");
		
	    LocalDate van = LocalDate.of(2018, 6, 18);
	    LocalDate tot = LocalDate.of(2018, 6, 23);

		Boeking boek1 = new Boeking(1, klant1, kamer1, van, tot); 
		System.out.println(boek1 + "\n");	
	}

	public void testAll() {
		System.out.println("Test met 4 klassen "); 
		testKlant();
		testKamerType(); 
		testKamer(); 
		testBoeking(); 
		System.out.println("Eind Test met 4 klassen \n\n"); 
	}
}
