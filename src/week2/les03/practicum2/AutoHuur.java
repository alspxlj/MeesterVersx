package week2.les03.practicum2;

public class AutoHuur{
	private int aantalDagen;
	private Klant huurder;
	private Auto gehuurdeAuto;

	public AutoHuur(){

	}

	public void setAantalDagen(int aD){
		aantalDagen = aD;
	}

	public void setGehuurdeAuto(Auto gA){
		gehuurdeAuto = gA;
	}

	public void setHuurder(Klant k){
		huurder = k;
	}

	public Auto getGehuurdeAuto(){
		return  gehuurdeAuto;
	}

	public Klant getHuurder(){
		return huurder;
	}

	public double totaalPrijs(){
		return (gehuurdeAuto.getPrijsPerDag() - (gehuurdeAuto.getPrijsPerDag() / huurder.getKorting())) * aantalDagen;
	}

	public String toString(){
		String message = "";
		if(huurder != null && gehuurdeAuto != null) {
			message = gehuurdeAuto+ "\n" +huurder+ "\naantal dagen: " +aantalDagen+ " en dat kost " +totaalPrijs();
		}else{
			message = "er is geen auto bekend\ner is geen huurder bekend\naantal dagen: 0 en dat kost 0.0";
		}
		return message;
	}
}