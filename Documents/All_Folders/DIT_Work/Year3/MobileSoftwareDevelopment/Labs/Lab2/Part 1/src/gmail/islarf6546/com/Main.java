package gmail.islarf6546.com;
public class Main {

	public static void main(String[] args) {

		Student p1 = new Student("Mark", 'M', "DT228");
		Student p2 = new Student("Pauleen", 'F', "DT211");
		
		System.out.printf("Person 1: " +p1 + "\n" + "Person 2: " + p2);
		
		p1.confirmDetails();
		p1.getCourseCode();
	}

}