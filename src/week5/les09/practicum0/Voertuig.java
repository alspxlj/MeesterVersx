package week5.les09.practicum0;
//import week5.les09.practicum0.Utils;

public abstract class Voertuig implements Goed {
	private String type;
	protected double nieuwprijs;
	protected int bouwjaar;
	
	public Voertuig(String tp, double np, int bj){
		type = tp;
		nieuwprijs = np;
		bouwjaar = bj;
	}

	public String getType(){
		return type;
	}

	public String toString(){
		String message = "Voertuig: " +type+ " met bouwjaar " +bouwjaar+" heeft een waarde van: "+Utils.euroBedrag(nieuwprijs)+ "\n";
		return message;	
	}
}
