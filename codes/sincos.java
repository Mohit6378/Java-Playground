import java.util.Scanner;

public class sincos {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of angle in degrees.");
		float angle = sc.nextFloat();
	
		float sinsqr = (float)Math.pow(Math.sin(Math.toRadians(angle)),2);
		float cossqr = (float)Math.pow(Math.cos(Math.toRadians(angle)),2);

		System.out.println("The sum of squares of sin and cos: " + (sinsqr+cossqr));
	}
}