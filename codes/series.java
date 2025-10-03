import java.util.Scanner;

public class series {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the integer to print number of terms:");
		int num = sc.nextInt();
		int fact = 1;
		float sum = 0f;

		for(int i = 1; i <= num; i++) {
			fact *= i;
			sum += (float)1/fact;
		}
		
		System.out.println("The sum of series (1/1!+1/2!+1/3!+...) till "+num+" term is: "+sum);
	}
}