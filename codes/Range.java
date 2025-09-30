import java.util.Scanner;

public class Range {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[10];

		System.out.println("Enter 10 numbers: ");

		for(int i = 0; i < 10; i++) {
			num[i] = sc.nextInt();
		}

		int min = num[0];
		int max = num[0];

		for(int i = 0; i < 10; i++) {
			if(num[i] < min)
				min = num[i];
			if(num[i] > max)
				max = num[i];
		}

		System.out.println("Range of given numbers is: " + (max-min));

		sc.close();
	}
}
