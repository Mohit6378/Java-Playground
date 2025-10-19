import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter 5 integers.");

		createArray(a, sc);

		System.out.println("Original Array: ");
		printArray(a);

		reverseArray(a);

		System.out.println("Reversed Array: ");
		printArray(a);

		sc.close();
	}


	public static void createArray(int[] a, Scanner sc) {
		for(int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
	}


	public static void printArray(int[] a) {
		for(int value : a)
			System.out.print(value+" ");
		System.out.println();
	}


	public static void reverseArray(int[] a) {
		int start = 0;
		int end = a.length-1;

		while(start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;

			start++;
			end--;
		}
	}
}