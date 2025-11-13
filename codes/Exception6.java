import java.util.Scanner;

class MyException extends RuntimeException {
	MyException(String message) {
		super(message);
	}
}

public class Exception6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int result;

		try {
			result = a/b;
			if (result == 0)
				throw new MyException("Result can't be zero.");
		} catch (MyException e) {
			result = 10;    //default value of result.
			System.out.println("Exception caught: " + e.getMessage());
		}

		System.out.println("result : " + result);
		sc.close();
	}
}