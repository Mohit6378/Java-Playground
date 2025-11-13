import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter denominator");
		int i = Integer.parseInt(sc.nextLine());
		int result = 0;
		String name = null;

		try {
			result = 10/i;
			System.out.println(name.length());
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException");
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		}

		System.out.println(name + " " + result);
		sc.close();
	}
}