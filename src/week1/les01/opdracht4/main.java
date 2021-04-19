package week1.les01.opdracht4;

public class main {
	static Student student_1;

	public static void main(String[] args){
		Student student_1 = new Student("Balgo");
		System.out.println("getter: " + student_1.getNaam());
		System.out.println("toString: " + student_1.toString());

		Student student_2 = new Student("Emms");
		System.out.println("getter: " + student_2.getNaam());
		System.out.println("toString: " + student_2.toString());
	}
}