import java.util.Scanner;

public class Exception1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want as denominator");
		int i = sc.nextInt();
		int result = 0;

		try {
			result = 10/i;
		} catch (ArithmeticException e) {
			System.out.println("Caught ArithmeticException: " + e.getMessage());
		}

		System.out.println("Division : " + result);
		sc.close();
	}
}