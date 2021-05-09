package week5.les09.practicum0;


public class Fiets extends Voertuig{
	private int framenummer;
	
	public Fiets(String tp, double np, int bj, int fN){
		super(tp, np, bj);
		framenummer = fN;
	}

	public int getFrameN(){
		return framenummer;
	}

	public double huidigeWaarde(){
		return nieuwprijs-(nieuwprijs / 100 *(bouwjaar * 30));
	}

	public boolean equals(Object obj){
		boolean gelijkeObjecten = false;
		
		if (obj instanceof Fiets) {
			Fiets andereVoertuig = (Fiets) obj;

			if (this.framenummer == andereVoertuig.framenummer){
				gelijkeObjecten = true;
			}
		}
		return gelijkeObjecten;	
	}
}
