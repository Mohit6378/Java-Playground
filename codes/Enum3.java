enum Planet {
	MERCURY(3.303e+23, 2.4397e6),
	EARTH(5.976e+24, 6.37814e6),
	MARS(6.421e+23, 3.3972e6);

	private final double mass;   // in kilograms
	private final double radius; // in meters

	Planet(double mass, double radius) {
		this.mass = mass;
		this.radius = radius;
	}

	public double surfaceGravity() {
		final double G = 6.67300E-11;
		return G*mass/(radius*radius);
	}
}

public class Enum3 {
	public static void main(String[] args) {
		for(Planet p : Planet.values())
			System.out.printf("Gravity on %s is %.2f%n",p,p.surfaceGravity());
	}
}