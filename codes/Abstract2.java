abstract class Animal {
	abstract void sound();

	void sleep() {
		System.out.println("Zzzzz..");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Bark.");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("Meow.");
	}
}

public class Abstract2 {
	public static void main(String[] args) {
		Animal dogeshBhai = new Dog();
		dogeshBhai.sound();
		dogeshBhai.sleep();

		Cat billi = new Cat();
		billi.sound();
		billi.sleep();
	}
}