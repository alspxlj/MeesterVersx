package week5.les09.practicum0;
import java.time.LocalDate;

public class Computer implements Goed {
	private String type;
	private String macAdres;
	private double aanschafprijs;
	private int productieJaar;
	
	public Computer(String tp, String mA, double aP, int pJ){
		type = tp;
		macAdres = mA;
		aanschafprijs = aP;
		productieJaar = pJ;
	}

	public double huidigeWaarde(){
		double huidigeWaarde;

		huidigeWaarde = Math.pow(0.7, LocalDate.now().getYear() - productieJaar) * aanschafprijs;
		return huidigeWaarde;
	}

	public boolean equals(Object obj){
		boolean gelijkObjecten = false;

		if(obj instanceof Computer) {
			Computer Comp = (Computer) obj;
			
			if(this.type.equals(Comp.type)){
				gelijkObjecten = true;
			}
		}
		return gelijkObjecten;	
	}
	
	public String toString() {
		String message = "Computer: " +type+ " heeft een waarde van: " +Utils.euroBedrag(huidigeWaarde())+ "\n";
		return message;
	}
}