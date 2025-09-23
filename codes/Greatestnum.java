import java.util.Scanner;

public class Greatestnum {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers:");

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		float big;

		big = a>b? (a>c? a:c) : (b>c? b:c);
		
		System.out.println(big+" is the greatest number.");
	}
}