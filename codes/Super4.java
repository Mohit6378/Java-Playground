class A {
	void greet() {
		System.out.println("Konichiwa.");
	}
}

class B extends A {
	class Inner {
		void greet() {
			B.super.greet();    //calls A's greet
		}
	}
}

public class Super4 {
	public static void main(String[] args) {
		B objB = new B();
		B.Inner objI = objB.new Inner();
		objI.greet();
	}
}