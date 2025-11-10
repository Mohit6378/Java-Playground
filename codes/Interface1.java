interface Animal {
	void makeSound();
}

class Dog implements Animal {
	public void makeSound() {
		System.out.println("Dog barks.");
	}
}

class Cat implements Animal {
	public void makeSound() {
		System.out.println("Cat meows.");
	}
}

public class Interface1 {
	public static void main(String[] args) {
		Animal kutta = new Dog();
		Animal billi = new Cat();
		kutta.makeSound();
		billi.makeSound();
	}
}