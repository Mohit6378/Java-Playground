class Pratishat {
	

	public static float Pratishat(float a, float b, float c, float d, float e) {
		return (((a+b+c+d+e)/500)*100);
	}
}

public class Percentage {
	public static void main(String args[]) {
		float marks = Pratishat.Pratishat(80,85,90,96.5f,86.5f);

		System.out.println(marks+"%");
	}
}