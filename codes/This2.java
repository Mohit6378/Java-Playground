abstract class Shape {
	abstract double perimeter();
	abstract double area();
	void display() {
		System.out.println("Area: " + this.area() + " Perimeter: " + this.perimeter());
	}
}

class Triangle extends Shape {
	private double height;
	private double base;

	Triangle() {
		this(1);   //call constructor with one parameter.
	}

	Triangle(double base) {
		this(base, base);   //calls constructor with 2 parameter.
	}

	Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	double area() {
		return (0.5*base*height);
	}

	double perimeter() {
		return base*3;  //assuming equilateral triangle ;v;
	}

}

class Rectangle extends Shape {
	private double length;
	private double width;

	Rectangle() {
		this(1); 
	}

	Rectangle(double side) {
		this(side, side);
	}

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	double area() {
		return length*width;
	}

	double perimeter() {
		return 2*(length+width);
	}
}

public class This2 {
	public static void main(String[] args) {
		Shape s1 = new Triangle();
		Shape s2 = new Triangle(4);
		Shape s3 = new Triangle(3,3);

		s1.display();
		s2.display();
		s3.display();

		Shape s11 = new Rectangle();
		Shape s22 = new Rectangle(2);
		Shape s33 = new Rectangle(3,4);

		s11.display();
		s22.display();
		s33.display();
	}
}