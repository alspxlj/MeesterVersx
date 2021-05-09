package week4.les08.opdracht8_4;

public class Main {
	public static void main(String[] args) {

		//Referentietype = Objecttype = Kat 
		Kat kat1 = new Kat ("Tom"); 
		System.out.println(kat1);
		System.out.println("aantal poten: " + kat1.getAantalPoten()); 
		System.out.println("speak: " + kat1.speak());
		kat1.setNaam("Minoes");
		System.out.println("naam: " + kat1.getNaam()); 
		
		kat1.setWekenDrachtig(9);
		System.out.println(kat1); 
		System.out.println("weken drachtig: " + kat1.getWekenDrachtig()); 
		System.out.println("spelen: " + kat1.spelen()); 

		
		//Referentietype = AbstractDier, Objecttype = Kat 
		AbstractDier dier1 = new Kat ("Minoes");
		System.out.println(dier1);
		System.out.println("aatal poten: " +dier1.getAantalPoten());
		System.out.println("speak: " +dier1.speak());
		dier1.setNaam("Minoes");
		System.out.println("naam: "+dier1.getNaam());
		dier1.setWekenDrachtig(9);
		System.out.println(dier1);
		System.out.println("weken drachtig: " +dier1.getWekenDrachtig());
		System.out.println("spelen: " +dier1.spelen());

		//System.out.println(dier1); 

		
		//casting met interface Huisdier 
		AbstractDier dier2 = new Kat ("Duko"); 
		Huisdier hd2 = (Huisdier) dier2; 
		System.out.println(hd2);
		System.out.println("aatal poten: " +hd2.getAantalPoten());
		System.out.println("speak: " + hd2.speak());
		hd2.setNaam("Minoes");
		System.out.println("naam: " +hd2.getNaam());
		hd2.setWekenDrachtig(9);
		System.out.println(hd2);
		System.out.println("weken drachtig: " +hd2.getWekenDrachtig());
		System.out.println("spelen: " +hd2.spelen());

		//System.out.println(hd2); 
		
		
		//casting met interface Boerderijdier
		AbstractDier dier3 = new Kat ("Jerry"); 
		Boerderijdier bd3 = (Boerderijdier) dier3; 
		//System.out.println(bd3); 
		

		//casting met interface Dier 
		AbstractDier dier4 = new Kat ("Minka"); 
		Dier d4 = (Dier) dier4; 
		//System.out.println(d4); 
		
		// reden
		// de methode setnaam() staat niet gedefineerd voor het object type AbstractDier
		// de methode getnaam() staat niet gedefineerd voor het object type AbstractDier
		// de methode setWekenDrachtig() staat niet gedefineerd voor het object type AbstractDier
		// de methode getWekenDrachtig() staat niet gedefineerd voor het object type AbstractDier
		// de methode spelen() staat niet gedefineerd voor het object type AbstractDier
		// de methode getAantalPoten() staat niet gedefineerd voor het object type HuisDier
		// de methode speak() staat niet gedefineerd voor het object type HuisDier
		// de methode speasetWekenDrachtigk() staat niet gedefineerd voor het object type HuisDier
		// de methode getWekenDrachtig() staat niet gedefineerd voor het object type HuisDier
	}

}
