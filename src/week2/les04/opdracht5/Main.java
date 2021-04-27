package week2.les04.opdracht5;

public class Main {
	public static void main(String[] arg) {
		Eigenaar eigenaar1 = new Eigenaar("James Watss");

		Eigenaar eigenaar2 = new Eigenaar("Betty po");
		eigenaar2.setHuisdier(new Huisdier("Scobby", "Delmatie"));
		eigenaar2.setHuisdier(new Huisdier("Rambo", "Rotwiler"));

		System.out.println(eigenaar1);
		System.out.println();
		System.out.println(eigenaar2);
	}
}