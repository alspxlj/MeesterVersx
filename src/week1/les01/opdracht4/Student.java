package week1.les01.opdracht4;

public class Student {
	private String naam;

	// Constructor
	public Student(String naam){
		this.naam = naam;
	}

	public String getNaam(){
		return naam;
	}

	public String toString(){
		String student_string = naam;
		return student_string;
	}
}