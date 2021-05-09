package week5.les09.practicum0;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Utils {
	private double bedrag;
	private int precisie;
	private static int counter;

	public Utils(double bedrag){
		this.bedrag = bedrag;
		this.precisie = 0;
	}

	public Utils(double bedrag, int precisie){
		this(bedrag);
		this.precisie = precisie;
	}

	public static String euroBedrag(double bedrag) {
		counter = counter + 1;
		DecimalFormat tweeCijfersFormat = new DecimalFormat("#.##");
		tweeCijfersFormat.setRoundingMode(RoundingMode.CEILING);

		String nieuwBedrag = "€" + tweeCijfersFormat.format(bedrag);
		return nieuwBedrag;
	}
	
	public static int getCounter() {
		return counter;
	}

}