import java.util.Scanner;

public class Greatestnum {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers:");

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		if(a > b && a > c)
			System.out.println(a + " is the greatest number");
		else if(a < b && b > c)
			System.out.println(b + " is the greatest number");
		else
			System.out.println(c + " is the greatest number");
	}
}