package week4.les07.opdracht7_1;

public class Main {
	public static void main(String[] args) {
		Huis h1 = new Huis();
		System.out.println(h1);
		
		Huis h2 = new Huis(10, 7, 1);
		h2.renoveer(2003, 2005);
		System.out.println(h2);
		
		Huis h3 = new Huis(12, 4, 5, true);
		h3.renoveer(2001);
		System.out.println(h3);
	};
}