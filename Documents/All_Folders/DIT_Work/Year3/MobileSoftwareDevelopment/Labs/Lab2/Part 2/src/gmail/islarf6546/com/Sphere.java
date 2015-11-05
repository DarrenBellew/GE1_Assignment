package gmail.islarf6546.com;

public class Sphere extends Circle implements ThreeDShape {

	public Sphere(int rad) {
		super(rad);
	}

	@Override
	public double volume() {
		return 4/3 * pi * (rad^3);
	}

	@Override
	public double area() {
		return 4*pi*(rad^2);
	}

	@Override
	public String toString()  {
		return this.getClass().getSimpleName() + "; Volume: " + volume() + " Area: " + area();
	}
}
