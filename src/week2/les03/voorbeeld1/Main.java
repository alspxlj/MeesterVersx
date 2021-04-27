package week2.les03.voorbeeld1;

public class Main { 
	public static void main(String[] arg) { 
		// maak 2 objecten aan van klasse Klant: 
		Klant k1 = new Klant("Jan", "Nijenoord 1", "Utrecht"); 
		Klant k2 = new Klant("Wim", "Oudenoord 340", "Utrecht"); 
		System.out.println(k1); 
		System.out.println(k2); 
		System.out.println(); 

		// we maken nu voor elk Klant-object een Rekening-object aan: 
		Rekening r1 = new Rekening(12345678); 
		Rekening r2 = new Rekening(13578642); 

		// en maken vervolgens de koppeling: 
		k1.setMijnRekening(r1); 
		k2.setMijnRekening(r2); 

		// storten kan nu alleen via de rekeninghouder 
		k1.getMijnRekening().stort(1000); 
		k2.getMijnRekening().stort(1503.05); 
		System.out.println(k1); 
		System.out.println(k1.getMijnRekening()); 

		// Rekening-object 
		System.out.println(); 
		System.out.println(k2); 
		System.out.println(k2.getMijnRekening()); // Rekening-object 
	} 
}