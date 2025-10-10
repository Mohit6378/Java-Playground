import java.util.Scanner;

//shifting method class
class Circular {
	int a,b,c;

	Circular(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	void shift() {
		int temp1 = a;
		int temp2 = b;
		a = c;
		b = temp1;
		c = temp2;
	}
}

//main method class
public class CircularShift {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three integer numbers.");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		Circular C = new Circular(a, b, c);
		System.out.println("Digits before circulation: "+a+"  "+b+"  "+c);

		C.shift();
		System.out.println("\nDigits after circulation: "+C.a+"  "+C.b+"  "+C.c);

		sc.close();
	}
}