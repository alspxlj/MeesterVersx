package week1.les01.opdracht5;

public class main {
	static Student student_1;

	public static void main(String[] args){
		Student student_1 = new Student("Balgo");
		System.out.println("naam: " + student_1.getNaam());
		System.out.println("nummer: " + student_1.getStudentNummer());
		student_1.setStudentNummer(12345678);
		System.out.println("toString: " + student_1.toString());
		System.out.println();

		Student student_2 = new Student("Emms", 98765432);
		System.out.println("naam: " + student_2.getNaam());
		System.out.println("nummer: " + student_2.getStudentNummer());
		System.out.println("toString: " + student_2.toString());
	}
}