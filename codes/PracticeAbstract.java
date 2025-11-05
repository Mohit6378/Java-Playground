abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing a circle.");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing a Triangle.");
	}
}

public class PracticeAbstract {
	public static void main(String[] args) {
		Shape gola = new Circle();
		gola.draw();

		Shape tri = new Triangle();
		tri.draw();
	}
}