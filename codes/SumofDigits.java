import java.util.Scanner;

class Sum {
	static int add(int a) {
		int sum = 0;
		while(a != 0) {
		sum = sum + (a%10);

		a /= 10;
		}
		return sum;
	}
}

public class SumofDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer to find sum of its digits.");

		int a = sc.nextInt();

		System.out.println("Sum of digits is: "+Sum.add(a));

		sc.close();
	}
}