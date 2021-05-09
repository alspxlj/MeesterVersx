package week5.les10.opdracht10_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		double getal = 0;
		int index = 0;

		FileReader fr = new FileReader("src/week5/les10/opdracht10_1/invoer.txt");
		BufferedReader br = new BufferedReader(fr);
		ArrayList<Double>getallenLijst = new ArrayList<Double>();
		String line = br.readLine();

		while(line != null){
			double cijfer = Double.parseDouble(line);
			getallenLijst.add(cijfer);
			line = br.readLine();
		}

		for(int i = 0; i < getallenLijst.size(); i++){
			getal = getal + getallenLijst.get(i);
			System.out.println(getallenLijst.get(i));
		}
		
		System.out.println();
		System.out.println("Aantal getallen: " + getallenLijst.size());
		System.out.println("gemiddeld: " + getal/getallenLijst.size());
		br.close();
	}

}
