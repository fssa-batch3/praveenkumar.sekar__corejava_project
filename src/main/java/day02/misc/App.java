package day02.misc;

public class App {

	public static void main(String[] args) {
		Academy academy1 = new Academy();

		academy1.setName("Freshworks Academy");
		academy1.setCode("FSSA");
		academy1.setId(123);

		Student student1 = new Student();

		student1.setName("Praveen");
		student1.setEmail("praveen@gmail.com");
		student1.setId(1);
		System.out.println(Student.count);

		Student student11 = new Student();

		student11.setName("Praveen");
		student11.setEmail("praveen@gmail.com");
		student11.setId(1);
		System.out.println(Student.count);
	}

}