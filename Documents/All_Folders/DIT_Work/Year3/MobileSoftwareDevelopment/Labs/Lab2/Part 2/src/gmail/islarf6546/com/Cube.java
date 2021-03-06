package gmail.islarf6546.com;

public class Cube extends Square implements ThreeDShape {

	public Cube(int side) {
		super(side);
	}

	@Override
	public double volume() {
		return side^3;
	}

	@Override
	public double area() {
		return side^2 * 6;
	}
	
	@Override
	public String toString()  {
		return this.getClass().getSimpleName() + "; Volume: " + volume() + " Area: " + area();
	}

}
