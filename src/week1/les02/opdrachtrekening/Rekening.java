package week1.les02.opdrachtrekening;

public class Rekening {
	private int nummer;
	private double saldo;

	public Rekening(int nummer){
		this.nummer = nummer;
	}

	public int getNummer(){
		return this.nummer;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public void stort(double bedrag){
		saldo = saldo + bedrag;
	}

	public void neemOp(double bedrag){
		saldo = saldo - bedrag;
	}

	public String toString(){
		String rekeningString = "Rekening nummer: " + nummer + " saldo " + saldo;
		return rekeningString;
	}
}