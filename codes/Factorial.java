import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter any positive number to find factorial");

		int num = sc.nextInt();
		int fact = 1;

		for(int i=1; i<=num; i++) {
		
		if(num > 1)	
		fact = fact*(i);
		
		else
		num = 1;
		}

		System.out.println("The factorial is: " + fact);
	}
}
		