import java.util.Scanner;

public class ToggleBit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Taking input
		System.out.println("Enter an integer.");
		int num = sc.nextInt();
		System.out.println("Enter the bit you want to toggle.");
		int target = sc.nextInt();

		//Toggling bit
		num = (num^(1<<target));
		System.out.println("Number after toggling the bit: "+num);

		sc.close();
	}
}