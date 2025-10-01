import java.util.Scanner;

public class PythagoreanTriplet {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the limit of sides:");
		int limit = sc.nextInt();

		for(int a=1; a <= limit; a++) {
			for(int b=a; b <= limit; b++) {

				int csquare = a*a + b*b;
				int c = (int)Math.sqrt(csquare);

				if(c <= limit && (c*c) == csquare)
					System.out.println("( "+a+", "+b+", "+c+" )");
			}
		}
	}
}