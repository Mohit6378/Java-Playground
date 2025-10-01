//Population is increasing at the rate of 10% per year for the last decade.

public class Population {
	public static void main(String args[]) {
		System.out.println("Current Population is 100000. Population at the end of each year for the last decade:");

		for(int i = 1; i <= 10; i++) {
			int Population = (int)(100000/Math.pow((1.10),(10-i)));
			System.out.println(i + "." + Population);
		}
	}
}