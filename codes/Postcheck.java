import java.util.Scanner;

public class Postcheck {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary between 15,000-40,000 to check the post of worker.");

		int sal = sc.nextInt();
		
		String post = sal >= 25000 && sal <= 40000? "Manager" : (sal >= 15000 && sal 		< 25000? "Accountant" : (sal >= 5000 && sal < 15000? "clerk" : 				"Invalid salary"));
		
		System.out.println(post);
	}
}