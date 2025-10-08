import java.util.Scanner;

public class Switch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of failed Subject.");
		int fail = sc.nextInt();

		System.out.println("Enter your division- 1,2 or 3.");
		int division = sc.nextInt();

		switch (division) {
			
			case 1:
				if(fail > 3)
					System.out.println("No Grace!");
				else
					System.out.println("5 marks grace.");
				break;
			case 2:
				if(fail > 2)
					System.out.println("No Grace!");
				else
					System.out.println("4 marks grace.");
				break;
			case 3:
				if(fail > 1)
					System.out.println("No Grace!");
				else
					System.out.println("5 marks grace.");
				break;
			default:
				System.out.println("Enter a valid input.");
		}
		sc.close();
	}
}