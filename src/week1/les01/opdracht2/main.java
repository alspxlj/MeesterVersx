package week1.les01.opdracht2;

public class main {
	klant klant_1;
	klant klant_2;
			
	public static void main(String[] args) {
		klant klant_1 = new klant("Steven", "Vistraat", "Utrecht");
		klant_1.setAdres("Vreeburg 38");
		System.out.println(klant_1.toString());

		
		klant klant_2 = new klant("Stephen", "traat", "Utrecht");
		klant_2.setPlaats("Amsterdam");
		System.out.println(klant_2.toString());
	}
}
