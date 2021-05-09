package week4.les07.practicum1;
import java.time.LocalDate;

public class Auto extends Voertuig {
	private String kenteken;
	
	public Auto(String tp, double np, int bj, String kt){
		super(tp, np, bj);
		kenteken = kt;
	}

	public String getKenteken(){
		return kenteken;
	}

	public double huidigeWaarde(){
		double waardeNu;

		waardeNu = Math.pow(0.7, LocalDate.now().getYear() - bouwjaar) * nieuwprijs;
		return waardeNu;
	}

	public boolean equals(Object obj){
		boolean gelijkeObjecten = false;

		if(obj instanceof Auto) {
			Auto andereAuto = (Auto) obj;
			
			if(this.kenteken.equals(andereAuto.kenteken)){
				gelijkeObjecten = true;
			}
		}
		
		return gelijkeObjecten;
	}
}