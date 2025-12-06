import java.util.Scanner;

public class ClearBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking input
		System.out.println("Enter an integer.");
		int num = sc.nextInt();
		System.out.println("Enter the bit you want to clear.");
		int target = sc.nextInt();

		//Clearing bit.
		num = (num & ~(1<<target));

		System.out.println("Number after clearing "+target+" bit: "+num);

		sc.close();
	}
}