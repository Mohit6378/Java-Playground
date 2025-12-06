import java.util.Scanner;

public class SetBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking input
		System.out.println("Enter an integer.");
		int num = sc.nextInt();

		System.out.println("Enter the bit you want to set.");
		int target = sc.nextInt();

		//Setting bit
		num = (num | (1<<target));

		System.out.println("Hence the number become: " + num);

		sc.close();
	}
}