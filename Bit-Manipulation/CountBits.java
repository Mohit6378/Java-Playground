import java.util.Scanner;

public class CountBits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking input.
		System.out.println("Enter an integer.");
		int num = sc.nextInt();
		int count = 0;

		//counting bits.
		while(num > 0) {
			count += (num & 1);
			num = num>>1;
		}
		System.out.println("Number of set bits: " + count);

		sc.close();
	}
}