import java.util.Scanner;

public class BitsToFlip {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;

		//Taking input.
		System.out.println("Enter an integer.");
		int num = sc.nextInt();
		System.out.println("Enter the target integer.");
		int target = sc.nextInt();

		//counting bits to be flipped to converted the integer to target.
		int result = (num ^ target);
		while(result > 0) {
			count += (result & 1);
			result = result >> 1;
		}

		//Printing the number of bits to be flipped.
		System.out.println("Number of bits to be flipped: "+count);

		sc.close();
	}
}