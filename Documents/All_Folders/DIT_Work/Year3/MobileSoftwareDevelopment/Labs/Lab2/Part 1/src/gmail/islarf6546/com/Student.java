package gmail.islarf6546.com;

public class Student extends Person implements PublishDetails{

	static int nextID = 1;
	int studentID;
	String courseCode;
	
	
	public Student(String name, char gender, int studentID, String courseCode) {
		super(name, gender);
		this.studentID = studentID;
		this.courseCode = courseCode;
		// TODO Auto-generated constructor stub
	}

	public Student(String name, char gender, String courseCode)  {
		this(name, gender, nextID++, courseCode);	
	}

	public String toString()  {
		return super.toString() + "; Student ID: " + studentID + "; Course Code: " + courseCode;
	}

	@Override
	public void confirmDetails() {
		// TODO Auto-generated method stub
		System.out.printf("\nStudent name: %s", getName());
	}

	@Override
	public void getCourseCode() {
		// TODO Auto-generated method stub
		System.out.printf("\n%s course code: %s", getName(), courseCode);
	}
	
	
}
