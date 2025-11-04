import java.util.Scanner;
import java.util.Arrays;

public class Sorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter integers in array.");
		CreateArray.create(a, sc);

		System.out.println("Original Array : "+Arrays.toString(a));

		Arrays.sort(a);

		System.out.println("Sorted Array : "+Arrays.toString(a));

		sc.close();
	}
}