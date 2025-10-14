import java.util.Scanner;

class Count {
	static int count(int a) {
		int counter = 0;
		while(a != 0) {
			a /= 10;
			counter++;
		}
		return counter;
	}
}

public class CountDigit {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer to count its digits.");

		int a = sc.nextInt();
		System.out.println("Number of digits are: "+Count.count(a));

		sc.close();
	}
}