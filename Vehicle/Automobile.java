package excercise1;

import java.util.Date;//to accurately judge the date and time

public class Automobile extends Vehicle {//main function for the subclass , extends ... assigns it as a subclass
	//below we have assigned the attributes the attributes
	private double km;
	private String damage;
	private Date arrdate;
	

	public Automobile(String type) 
	{
		this(type, 0, "none", new Date());
	}
	
	public Automobile(String type, double km, String damage, Date arrdate)
	{
		super(type);
		this.km = km; //Kilometres
		this.damage = damage;//damage to the motorcycle
		this.arrdate =arrdate;//date and time
	
	}
	//same as the vehicle class expect the different attributes.
	public double getkm() 
	{
		return km;
	}

	public void setkm(double km) 
	{
		this.km = km;
	}

	public String getdamage() 
	{
		return damage;
	}

	public void setdamage(String damage) 
	{
		this.damage = damage;
	}

	public Date getarrdate() 
	{
		return arrdate;
	}

	public void setDateHired(Date arrdate) 
	{
		this.arrdate = arrdate;
	}

	@Override
	public String toString()  //Arrange the result to be printed
	{
		return "Automobile [Type= " + super.gettype() + ", KM = " + km + ", Damage = " + damage+ ", Arrival Date = " + arrdate + "]";//information we extract from the function
	}
	
	

}