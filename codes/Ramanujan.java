public class Ramanujan {
	public static void main(String args[]) {
		int limit = 10000;
		System.out.println("The Ramanujan number under 10000 are:");

		for(int a = 1; a*a*a <= limit; a++) {
			for(int b = a; (a*a*a + b*b*b) <= limit; b++) {
				int sum1 = (a*a*a) + (b*b*b);

				for(int c = a+1; c*c*c < limit; c++) {
					for(int d = c; (c*c*c + d*d*d) <= limit; d++) {
						int sum2 = (c*c*c) + (d*d*d);

						if(sum1 == sum2 && !(a==c && b==d)) {
							System.out.println(a+", "+b+", "+c+", "+d+" = "+sum1);
						}
					}
				}
			}
		}
	}
}