public class CheckSetBit {
	public static void main(String[] args) {
		System.out.println("We are taking 129 as integer for our example.\nwe are gonna check if its 7th bit is set or not.");

		int a = 129;
		int target = 7;

		//checking if the bit is set or not.
		if((a & (1<<target)) == 0) {
			System.out.println("Targeted bit is not set.");
		} else {
			System.out.println("Targeted bit is set.");
		}

	}
}