import java.util.Scanner;

public class SumofArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		System.out.println("Enter integer elements of array:");

		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		System.out.print("Sum of elements of array is: ");

		for(int value:a) {
			sum += value;
		}
		System.out.print(sum);

		sc.close();
	}
}