import java.util.Scanner;

class CreateArray {
	static void create(int[] a, Scanner sc) {
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}
}

public class EqualArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int[] b = new int[5];
		boolean equality = false;

		System.out.println("Enter integers for first array.");
		CreateArray.create(a, sc);

		System.out.println("Enter integers for second array.");
		CreateArray.create(b, sc);

		for(int i = 0; i < 5; i++) {
			if(a[i] != b[i]) {
				equality = false;
				break;
			}
			else
				equality = true;
		}

		if(equality)
			System.out.println("You have entered equal array.");
		else
			System.out.println("Arrays are not equal.");

		sc.close();
	}
}

