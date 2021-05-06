package week4.les07.opdracht7_1;

public class Gebouw {
	private int lengte;
	private int breedte;
	private int aantalVerdiepingen;
	public int laatsteRenovatie; //buiten

	public Gebouw(){

	} 

	public Gebouw(int l, int b, int aV){
		lengte = l;
		breedte = b;
		aantalVerdiepingen = aV;
	}

	public int oppervlakte(){
		int oppervlakte = 0;
		return oppervlakte;
	}

	public void renoveer(int jaarBuiten){
		int jaarBuiten = 0;
	}

	public int brekenHuur(){
		int huur = 0;
		return huur;
	}

	public String toString(){
		String message = "Lengte " +lengte+ " breedte " +breedte+ " aantalVerdiepingen " + aantalVerdiepingen;
		return message;
	}
}