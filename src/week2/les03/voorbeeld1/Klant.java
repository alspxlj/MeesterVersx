package week2.les03.voorbeeld1;

public class Klant {
	private String naam;
	private String adres;
	private String plaats;
	private Rekening mijnRekening;
	
	public Klant(String naam, String adres, String plaats) {
		this.naam = naam;
		this.adres = adres;
		this.plaats = plaats;
	}

	public void setMijnRekening(Rekening r) {
		mijnRekening = r; 
	} 

	public Rekening getMijnRekening() {
		return mijnRekening; 
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getPlaats() {
		return plaats;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

	public String toString(){
		String klant = naam + ", woont op " + adres + " , in " + plaats;
		if (mijnRekening == null) {
			klant = klant + ", er is nog geen rekening bekend";
		}else{
			klant = klant + ";\n" + mijnRekening.toString();
		}
		return klant;
	}

}