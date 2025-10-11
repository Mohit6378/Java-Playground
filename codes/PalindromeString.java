import java.util.Scanner;

class Reverse {
	static String reverse(String name) {
		return (name == null) ? null : new StringBuffer(name).reverse().toString();
	}
}

public class PalindromeString {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check palindrome.");
		String name = sc.nextLine();

		String rev = Reverse.reverse(name);

		if(rev.equalsIgnoreCase(name))
			System.out.println("It is a palindrome string.");
		else
			System.out.println("Not a palindrome string.");

		sc.close();
	}
}