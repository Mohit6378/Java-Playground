public class Exception4 {
	public static void main(String[] args) {
		try {
			int x = 5/0;
		} catch (ArithmeticException e) {
			System.out.println("Exception Handled");
		} finally {
			System.out.println("Finally block always runs.");
		}
	}
}