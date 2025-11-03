import java.util.Scanner;
import java.util.Arrays;

public class Bubblesort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		System.out.println("Enter integers of array.");

		createArray(a, sc);

		System.out.println("Original array: "+Arrays.toString(a));

		bubbleSortAlgo(a);

		System.out.println("Array after sorting: "+Arrays.toString(a));

		sc.close();
	}

//Method to create array.
	public static void createArray(int[] a, Scanner sc) {
		for(int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
	}

//Bubble sorting method.
	 public static void bubbleSortAlgo(int[] a) {
		boolean swapped;

		//outer loop for each pass.
		for(int i = 0; i < a.length; i++) {
			swapped = false;
			for(int j = 0; j < a.length-i-1; j++) {
				if (a[j] > a[j+1]) {
					//swap a[j] and a[j+1]
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					swapped = true;
				}
			}
			// if no swaps occured, the array is already sorted.
			if (!swapped) break;
		}
	}
}
			