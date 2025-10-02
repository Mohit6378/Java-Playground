import java.util.Scanner;

public class Fibonacci {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of Series:");
		int num = sc.nextInt();

		int first = 0, second = 1;

		for(int i = 0; i <= num; i++) {
			System.out.println(first);
			int next = first+second;
			first = second;
			second = next;
		}
	}
}