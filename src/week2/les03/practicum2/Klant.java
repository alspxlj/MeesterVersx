package week2.les03.practicum2;

public class Klant {
	private String naam;
	private double kortingsPercentage;

	public Klant(String nm){
		naam = nm;
	}

	public void setKorting(double kP){
		kortingsPercentage = kP;
	}

	public double getKorting(){
		return kortingsPercentage;
	}

	public String toString(){
		String message = "Op naam van: " +naam+ " (korting: " +kortingsPercentage+ "%)";
		return message; 
	}
}
