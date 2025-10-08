class Pair {
	int a;
	int b;

	Pair(int a, int b){
		this.a = a;
		this.b = b;
	}
}

public class SwapInt {
	public static void main(String args[]) {
		Pair numbers = new Pair(2,8);		

		System.out.println("1st number -> "+numbers.a+"\n2nd number -> "+numbers.b);
		swap(numbers);

		System.out.println("After Swap:\n1st number -> "+numbers.a+"\n2nd number -> "+numbers.b);
	}

	public static void swap(Pair p) {
		int temp = p.a;
		p.a = p.b;
		p.b = temp;
		
	}

}

