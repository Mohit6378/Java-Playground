import java.util.Scanner;

public class PowerOf2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking input
		System.out.println("Enter an integer.");
		int num = sc.nextInt();

		//Checking if the number is a power of 2.
		if((num & (num-1)) == 0) {
			System.out.println("The number is in the power of 2.");
		} else {
			System.out.println("The number is not in the power of 2.");
		}

		sc.close();
	}
}