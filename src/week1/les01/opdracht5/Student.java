package week1.les01.opdracht5;

public class Student {
	private String naam;
	private int studentNummer;

	// Constructor
	public Student(String naam){
		this.naam = naam;
	}
	
	public Student(String naam, int studentNummer){
		this.naam = naam;
		this.studentNummer = studentNummer;
	}

	public String getNaam(){
		return naam;
	}

	public int getStudentNummer(){
		return studentNummer;
	}

	public void setStudentNummer(int studentNummer){
		this.studentNummer = studentNummer;
	}

	public String toString(){
		String student_string = "Deze student heet " + naam + "en heeft nummer: " + studentNummer;
		return student_string;
	}
}