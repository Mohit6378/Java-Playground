class A {
	void show() {
		System.out.println("A's Show.");
	}
}

class B extends A {
	void show() {
		super.show();
		System.out.println("B's Show.");
	}
}

public class Super2 {
	public static void main(String[] args) {
		A objB = new B();
		objB.show();
	}
}