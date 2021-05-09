package week4.les08.opdracht8_5;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<AbstractDier> dieren = new ArrayList<AbstractDier>();
		 
		dieren.add(new Kat ("Tom"));
		dieren.add(new Koe ("Dave"));
		dieren.add(new Hamster ("Lara"));
		dieren.add(new Kat ("Thams"));
		dieren.add(new Koe ("Stevie"));
		dieren.add(new Hamster ("Jess"));

		for(AbstractDier dier : dieren){
			System.out.println(dier.toString()+" Speak: "+ dier.speak());
//			dier.setLitersMelk(4.5);
//			dier.spelen();
		}
	}
	
//	om Spelen en setLitersMelk te laten werken moet er gecheckt worden wat voor typen dier het is
//	en dan gecast worden.

}
