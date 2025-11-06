class A {
	A(String msg) {
		System.out.println(msg);
	}
}

class B extends A {
	B() {
		super("called super class");
	}
}

public class SuperExample {
	public static void main(String[] args) {
		A objA = new A("A's object");
		System.out.println("");
		A objB = new B();
	}
}
