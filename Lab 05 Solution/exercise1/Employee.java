package exercise1;

import java.util.Date;

public class Employee extends Person {
	private double salary;
	private String office;
	private Date dateHired;
	

	public Employee(String name) {
		this(name, 0, "none", new Date());
	}
	
	public Employee(String name, double salary, String office, Date dateHired){
		super(name);
		this.salary = salary;
		this.office = office;
		this.dateHired =dateHired;
	
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", office=" + office
				+ ", dateHired=" + dateHired + "name= "+super.getName()+"]";
	}
	
	

}
