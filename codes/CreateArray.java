import java.util.Scanner;

public class CreateArray {
	public static void create(int[] arr, Scanner sc) {
		for(int i = 0; i < arr.length; i++)
			arr[i] = sc.nextInt();
	}
}