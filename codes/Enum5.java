enum Operation {
	PLUS {
		double apply(double x, double y) { return x+y; }
	},
	MINUS {
		double apply(double x, double y) {return x-y; }
	};

	abstract double apply(double x, double y);
}

public class Enum5 {
	public static void main(String[] args) {
		double result = Operation.PLUS.apply(4,5);
		System.out.println(result);
	}
}