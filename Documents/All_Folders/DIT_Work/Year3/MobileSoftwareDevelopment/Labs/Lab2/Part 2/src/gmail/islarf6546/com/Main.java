package gmail.islarf6546.com;

public class Main {
	public static void main(String[] args) {
		Shape[] c = new Shape[20];
		int i=0;
		int temp = i;
		while(i < c.length/4)  {
			c[i] = new Square((i+1)*2);
			i++;
		}
		temp = i;
		while(i < temp+c.length/4)  {
			c[i] = new Circle((i+1)*2);
			i++;
		}
		temp = i;
		while(i < temp+c.length/4)  {
			c[i] = new Cube((i+1)*2);
			i++;
		}
		temp = i;
		while(i < temp+c.length/4)  {
			c[i] = new Sphere((i+1)*2);
			i++;
		}
		
		for(i=0; i<c.length; i++)  {
			System.out.println(c[i]);
		}
		
	}
}