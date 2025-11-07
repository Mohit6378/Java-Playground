enum Day {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

public class Enum1 {
	public static void main(String[] args) {
		Day today = Day.Friday;
		System.out.println("Today is: " + today);
	}
}