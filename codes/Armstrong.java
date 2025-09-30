import java.util.Scanner;

public class Armstrong {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till which you want to check Armstrong numbers");

		int num = sc.nextInt();
		
		
		

		for(int i = 1; i <= num; i++) {
			
			int sum = 0;
			int originalNum = i;
			int digits = String.valueOf(originalNum).length();
			
			while(originalNum > 0) {
				int digit = originalNum % 10;
				sum += Math.pow(digit, digits);
				originalNum /= 10;
				}
		
		if (sum == i)
			System.out.print(sum + ",  ");
		}

		sc.close();
	}
}