class Addition {

	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	static void add(double a, double b) {     //only changing return type won't work.
		System.out.println(a + b);
	}
}

public class Methodoverloading {
	public static void main(String args[]) {
		Addition.add(4,5);
		Addition.add(4,5,6);
		Addition.add(4.5,5);
	}
}