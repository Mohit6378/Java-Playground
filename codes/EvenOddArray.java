import java.util.Scanner;

class EvenOdd {
	static void printEvenOdd(int[] a) {
		StringBuilder even = new StringBuilder("Even: ");
		StringBuilder odd = new StringBuilder("Odd: ");

		for(int value : a) {
			if(value % 2 == 0)
				even.append(value).append(", ");
			else
				odd.append(value).append(", ");
		}

		//Remove trailing comma
		if(even.length() > 6) even.setLength(even.length() - 2);
		if(odd.length() > 5) odd.setLength(odd.length() - 2);

		System.out.println(even);
		System.out.println(odd);
	}
}

public class EvenOddArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];

		System.out.println("Enter elements of array.");
		for(int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		EvenOdd.printEvenOdd(a);

		sc.close();
	}
}
		