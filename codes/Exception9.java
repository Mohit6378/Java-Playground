public class Exception9 {
	public static void methodA() throws Exception {
		methodB();
	}

	public static void methodB() throws Exception {
		throw new Exception("Exception from method B");
	}

	public static void main(String[] args) 	{
		try {
			methodA();
		} catch (Exception e) {
			System.out.println("Exception Caught: " + e.getMessage());
		}
	}
}