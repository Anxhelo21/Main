package exercise1;

public class Test {

	public static void main(String[] args) {

		Person[] persons= {
		                  new Person("John"),
		                  new Student(Student.FRESHMAN, "John2"),
		                  new Employee("John3"),
		                  new Staff("John4", "director")
		};
		
		for(Person  p : persons){
			System.out.println("The person information: "+ p);
			if(p instanceof Student){
				System.out.println("The student information: "+(Student) p);
			}
			if(p instanceof Employee){
				System.out.println("The student information: "+(Employee) p);
			}
			if(p instanceof Staff){
				System.out.println("The student information: "+(Staff) p);
			}
		}
	}

}
