import java.util.Scanner;

class Reverse {
	static String reverse(String rev) {
		String reversed = "";
		for(int i = rev.length()-1; i >=0; i--) {
			reversed += rev.charAt(i);
		}
		return reversed;
	}
}

public class ReverseString1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");

		String original = sc.nextLine();
		System.out.println("Reversed String: "+Reverse.reverse(original));

		sc.close();
	}
}