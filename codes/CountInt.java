import java.util.Scanner;

public class CountInt {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int positiveCount = 0;
		int negativeCount = 0;
		int zeroCount = 0;

		while(true) {
			System.out.println("Enter an integer: ");
			String input = sc.nextLine();

			if(input.equalsIgnoreCase("exit"))
				break;

			try{
				int number = Integer.parseInt(input);

				if(number > 0)
					positiveCount++;
				else if(number < 0)
					negativeCount++;
				else
					zeroCount++;
			}

			catch(NumberFormatException e) {
				System.out.println("Enter a valid integer or 'exit' ");
			}
		}

		System.out.println("\nNumber of positive integer: " + positiveCount);
		System.out.println("Number of negative integer: " + negativeCount);
		System.out.println("Number of Zeroes: " + zeroCount);

		sc.close();
	}
}
