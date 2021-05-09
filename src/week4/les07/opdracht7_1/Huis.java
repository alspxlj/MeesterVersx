package week4.les07.opdracht7_1;

public class Huis extends Gebouw {
	public boolean isGeisoleerd;
	public int laatsteRenovatie; //binnen

	public Huis(){
		super();
	}

	public Huis(boolean isG){
		super();
		isGeisoleerd = isG;
	}

	public Huis(int l, int b, int aV){
		super(l, b, aV);
	}

	public Huis(int l, int b, int aV, boolean isG){
		super(l, b, aV);
		isGeisoleerd = isG;
	}

	public void isoleer(){
		isGeisoleerd = isGeisoleerd;
	}

	public void renoveer(int binnen){
		laatsteRenovatie = binnen;
	}

	public void renoveer(int binnen, int buiten){
		laatsteRenovatie = binnen;
		super.laatsteRenovatie = buiten;
		
	}

	public int berekenHuur(){
		int huur = super.oppervlakte() * 100;
		return huur;
	}

	public String toString(){
		String message = super.toString()+ " Is geisoleerd: " +isGeisoleerd+ " laatsteRenovatie binnen" +laatsteRenovatie + " Huur: " +brekenHuur();
		return message;
	}
}