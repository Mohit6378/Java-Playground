import java.util.Scanner;

class Count {
	int e = 0, o = 0;

	static Count count(int a) {
		Count result = new Count();
		while(a != 0) {
			int check = a % 10;

			if(check % 2 == 0)
				result.e++;
			else
				result.o++;

			a /= 10;
		}
		return result;
	}
}

public class CountEvenOddDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer to check number of even and odd digits in it.");
		
		int a = sc.nextInt();

		Count c = Count.count(a);

		System.out.println("Number of even: "+c.e+"\nNumber of odd: "+c.o);

		sc.close();
	}
}