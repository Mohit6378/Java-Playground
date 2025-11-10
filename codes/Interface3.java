import java.util.Scanner;

@FunctionalInterface
interface Calculate {
	int operate(int a, int b);
}

public class Interface3 {
	public static void main(String[] args) {
		Calculate add = (a, b) -> a+b;
		Calculate minus = (a, b) -> a-b;
		Calculate multiply = (a, b) -> a*b;
		Calculate divide = (a, b) -> a/b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Two integers to apply operation.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Addition: "+ add.operate(a, b));
		System.out.println("Subtraction: "+ minus.operate(a, b));
		System.out.println("Multiply: "+ multiply.operate(a, b));
		System.out.println("Division: "+ divide.operate(a, b));

		sc.close();
	}
}