class Student {
	private String name;
	private int age;

	Student() {
		this("Unknown", 0);  //calls parameterized constructor.
	}

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	void display() {
		System.out.println(name + " is " + age + " years old.");
	}
}

public class ThisExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student("Mohit", 24);

		s1.display();
		s2.display();
	}
}