import java.util.Scanner;

public class Octal {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter an integer to convert it into its octal equivalent");

		int decimal = sc.nextInt();
		int dividend = decimal;
		String octal = "";

		while(dividend > 0) {
			octal += dividend % 8;
			dividend /= 8;
		}

		String reverse = new StringBuilder(octal).reverse().toString();
		System.out.println("Octal equivalent of " + decimal + " -> " + reverse);

		sc.close();
	}
}