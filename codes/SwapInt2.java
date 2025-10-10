import java.util.Scanner;

class Pair {
	int first;
	int second;

	Pair(int a, int b) {
		first = a;
		second = b;
	}
}

class Swapper {
	static void swap(Pair P) {
		P.first = P.first + P.second;
		P.second = P.first - P.second;
		P.first = P.first - P.second;
	}
}

public class SwapInt2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter two integers to swap.");
		int a = sc.nextInt();
		int b = sc.nextInt();

		Pair P = new Pair(a,b);

		System.out.println("Number before swapping: "+a+"  "+b);

		Swapper.swap(P);

		System.out.println("Number after swapping: "+P.first+"  "+P.second);
	}
}