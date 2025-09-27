public class Ascii {
	public static void main(String args[]) {

		System.out.println("Table of ASCII characters is given below");
		
		for(int i=0; i <= 127; i++){
			char ch = (char)i;

			System.out.printf("%3d\t\t%1s%n", i, ch);
		}
	}
}