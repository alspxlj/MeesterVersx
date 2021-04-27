package week2.les04.practicum3;
import java.util.*;

public class Klas {
	private String klasCode;
	private ArrayList<Leerling> deLeerlingen;

	public Klas(String kC){
		klasCode = kC;
		deLeerlingen = new ArrayList<Leerling>();
	}

	public void voegLeerlingToe(Leerling l){
		deLeerlingen.add(l);
	}

	public void wijzigCijfer(String nm, double nweCijfer){
		for (Leerling leerling : deLeerlingen){
			if (leerling.getNaam().equals(nm)) {
				leerling.setCijfer(nweCijfer);
			}
		}
	}

	public ArrayList<Leerling> getLeerlingen(){
		return deLeerlingen;
	}

	public int aantalLeerlingen(){
		return deLeerlingen.size();
	}
	
	public String toString() {
		String message = "In Klas " + klasCode + " zitten de volgende leerlingen: \n";
		if (deLeerlingen.size() == 0) {
			message = message + " Heeft geen Leerling.";
		}else{
			for (Leerling leerling : deLeerlingen){
				message = message + leerling;
			}
		}
		return message;
	} 
}
