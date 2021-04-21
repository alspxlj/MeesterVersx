package week1.les02.opdrachtproduct;

public class Product {
	private String naam;
	private String code;
	private double prijs;
	private double btw;

	public Product(String naam, String code, double prijs){
		this.naam = naam;
		this.code = code;
		this.prijs = prijs;
	}

	public Product(String naam, String code){
		this.naam = naam;
		this.code = code;
	}

	public void setBTW(double btw){
		this.btw = btw;
	}

	public void setPrijs(double prijs){
		this.prijs = prijs;
	}

	public double getBTW(){
		return this.btw;
	}

	public double getPrijs(){
		return this.prijs;
	}

	public void verhoogPrijsMet(double extra){
		this.prijs = prijs + extra;
	}

	public double btwBedrag(){
		return btw;
	}

	public String toString(){
		String productString = "Product " + naam + " code " + code + " prijs " + prijs + " btw " + btw;
		return productString;
	}
}