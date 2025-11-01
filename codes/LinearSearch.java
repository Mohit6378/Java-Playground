import java.util.Scanner;

public class LinearSearch {
	public static void createArray(int[] a, Scanner sc) {
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}


	public static int search(int[] a, int target) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == target)
				return i;
		}
		return -1;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];

		System.out.println("Enter 5 integers of Array.");
		createArray(a, sc);

		System.out.println("Enter the number you want to search in Array");
		int target = sc.nextInt();

		int result = search(a, target);

		if(result != -1)
			System.out.println("Element found at: "+result);
		else
			System.out.println("Element not present.");

		sc.close();
	}
}

		