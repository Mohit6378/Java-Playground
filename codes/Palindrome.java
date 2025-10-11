import java.util.Scanner;

class Reverse {
	public static int reverse(int a) {
		int rev=0;
		while(a != 0) {
			rev = rev*10 + a%10;
			a /= 10;
		}
		return rev;
	}
}

public class Palindrome {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer to check palindrome.");

		int a = sc.nextInt();
		int rev = Reverse.reverse(a);

		if(a == rev)
		System.out.println(a+" is a valid palindrome number.");
		else
		System.out.println("Not a palindrome number.");

		sc.close();
	}
}