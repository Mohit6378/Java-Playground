import java.util.Scanner;
import java.util.HashSet;

public class DuplicateElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[6];

		createArray(a, sc);

		checkDuplicate(a);

		sc.close();
	}

//Function to create Array.
	public static void createArray(int[] a, Scanner sc) {
		System.out.println("Enter 6 integer element of arrays.");
		for(int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();
	}

//Function to check Duplicancy.
	public static void checkDuplicate(int[] a) {
		HashSet<Integer> num = new HashSet<>();
		for(int i = 0; i < a.length; i++) {
			if(!num.add(a[i]))
				System.out.println("Duplicate found: ["+a[i]+"] at "+i);
		}
	}
}