public class Intelliformula {
	public static void main(String args[]) {
		System.out.println("Here is table of value of i according to the formulua: 'i = 2 + ( y + 0.5x )' for every y -> 1 to 6 and x -> 5.5 to 12.5");

		for(float y = 1f; y < 7; y++) {
			for(float x = 5.5f; x <= 12.5; x += 0.5) {
				
				System.out.println("2 + (" +y+ " + 0.5*" +x+ ") = " + (2+(y+0.5*x)));
			}
		}
	}
}