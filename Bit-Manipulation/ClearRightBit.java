import java.util.Scanner;

public class ClearRightBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking input
		System.out.println("Enter an integer.");
		int num = sc.nextInt();

		//clearing the right-most bit of the number.
		num = (num & (num-1));
		System.out.println("number after clearing right-most bit: "+num);

		sc.close();
	}
}