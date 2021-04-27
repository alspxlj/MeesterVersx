package week2.les03.voorbeeld1;

public class Rekening {
	private int nummer;
	private double saldo = 0.0;

	public Rekening(int nummer){
		this.nummer = nummer;
	}

	public int getNummer() {
		return nummer;
	}

	public double getSaldo() {
		return saldo;
	}

	public void stort(double bedrag) {
		saldo = saldo + bedrag;
	}

	public void neemOp(double bedrag){
		saldo = saldo - bedrag;
	}
	
	public String toString(){
		String rekening = "Op rekening " + nummer + " staat " + saldo;
		return rekening;
	}

}