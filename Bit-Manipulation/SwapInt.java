import java.util.Scanner;

public class SwapInt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers you want to swap.");

		//Taking input integers.
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Integers before swap: a = " + a + " b = " + b);

		//swapping integers using xor operator.
		a = a^b;
		b = a^b;
		a = a^b;

		System.out.println("Integers after swap: a = " + a + " b = " + b);

		sc.close();
	}
}