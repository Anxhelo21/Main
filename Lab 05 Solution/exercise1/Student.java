package exercise1;

public class Student extends Person{

	public static final String FRESHMAN = "Freshman";
	
	protected String status;

	public Student(String name){
		super(name);
	}
	
	public Student(String status, String name) {
		super(name);
		this.status = status;
	}

	@Override
	public String toString() {
		return "Student [status=" + status + ", name=" + super.getName() + "]";
	}
	
	
	
}
