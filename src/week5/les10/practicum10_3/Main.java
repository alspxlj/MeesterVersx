package week5.les10.practicum10_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		
		FileReader lees = new FileReader("src/week5/les10/practicum10_3/prices_usd.txt");
		BufferedReader lol = new BufferedReader(lees);
		System.out.println("geef de wisselkoers: ");
		Scanner scanner = new Scanner(System.in);
		String koers = scanner.nextLine();

		double koersDouble = Double.parseDouble(koers);
		double Koers = koersDouble/100;
		FileWriter fw = new FileWriter("src/week5/les10/practicum10_3/prices_euro.txt");
		PrintWriter pw = new PrintWriter(fw);
		
		String regel = lol.readLine();
		while (regel != null){
			String[] values = regel.split(" : ");
			String productNaam = values[0];
			String bedragDollar = values[1];

			double bedragDollarDouble = Double.parseDouble(bedragDollar);
			double bedragEuro = bedragDollarDouble*koersDouble;
			System.out.println("Euro bedrag: " +bedragEuro);

			regel = lol.readLine();
			pw.println(productNaam + " : " + bedragEuro);
		}
		lol.close();
		pw.close();
	}
}
