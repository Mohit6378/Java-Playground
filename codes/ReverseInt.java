import java.util.Scanner;

class Reverse {
	static int reverse(int a) {
		int rev = 0;

		int sign = a < 0? -1 : 1;
		a = Math.abs(a);          // to handle negative integers.

		while(a != 0) {
			rev = rev*10 + a%10;
			a /= 10;
		}
	return rev*sign;
	}
}

public class ReverseInt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter positive integer you want to reverse.");
		int num = sc.nextInt();

		int reversed = Reverse.reverse(num);

		System.out.println("Reversed value: "+reversed);

		sc.close();
	}
}