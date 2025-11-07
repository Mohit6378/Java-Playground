enum Level {
	Low, Medium, High
}

public class Enum2 {
	public static void main(String[] args) {
		Level level = Level.High;

		switch (level) {
			case Low:
				System.out.println("Your level is low.");
				break;
			case Medium:
				System.out.println("You are so mid.");
				break;
			case High:
				System.out.println("YOu are god level.");
				break;
		}
	}
}