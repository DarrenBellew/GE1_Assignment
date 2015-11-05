package gmail.islarf6546.com;

public class Square extends Shape {

	int side;
	
	
	
	public Square(int side)  {
		this.side = side;
	}
	
	@Override
	public double area() {
		
		return side*side;
	}
	
	public int getSide()  {
		return side;
	}
	
	public void setSide(int side)  {
		this.side=side;
	}
	
	public String toString()  {
		return(this.getClass().getSimpleName() + "; area: "+area());
	}

}
