package gmail.islarf6546.com;

public class Circle extends Shape {
	
	int rad;
	final double pi = 3.14;
	
	
	public Circle(int rad) {
		this.rad = rad;
	}

	@Override
	public double area() {
		
		return pi * (rad^2);
	}

	public int getRad()  {
		return rad;
	}
	public void setRad(int rad)  {
		this.rad=rad;
	}
	
	public String toString()  {
		return(this.getClass().getSimpleName() + "; area: "+area());
	}
	
}
