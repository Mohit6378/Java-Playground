class A {
	protected int value = 5;
}

class B extends A {
	private int value = 10;

	void printValue() {
		System.out.println("child : " + value);
		System.out.println("Parent : " + super.value);
	}
}

public class Super3 {
	public static void main(String[] args) {
		B objB = new B();
		objB.printValue();
	}
}