import java.util.Scanner;

public class Exception5 {
	public static void validateAge(int age) {
		if (age <18)
			throw new IllegalArgumentException("Age must be 18+ to enter this site.");
		else
			System.out.println("Enjoy your loneliness.");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age first.");
		int age = sc.nextInt();
		try {
		validateAge(age);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught:You are not an adult.");
		}
	}
}