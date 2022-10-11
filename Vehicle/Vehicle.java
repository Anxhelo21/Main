package excercise1;

public class Vehicle { //Create the main class 'Vehicle' that will include all other subclasses.
	private String type, model, price, condition; //attributes

	public Vehicle(String type){
		this.type = type;
	}
	
	public Vehicle(String type, String model, String price, String condition) { //assign attributes as string
		super();
		this.type = type;
		this.model = model;
		this.price = price;
		this.condition = condition;
	}

	public String gettype() //Get the specified type
	{
		return type; //Information we extract from function
	}

	public void settype(String type) //Set the type to current
	{
		this.type = type;
	}

	public String getmodel() //Get the model
	{
		return model;//Information we extract from function
	}

	public void setModel(String model) //Set the model to current
	{
		this.model = model;
	}

	public String getprice() { //Get the price
		return price;//Information we extract from function
	}

	public void setprice(String price) 
	{
		this.price = price;//assign price to current
	}

	public String getcondition() //extract the condition
	{
		return condition; //information we extract from function
	}

	public void setcondition(String condition) //set the condition to current using function
	{
		this.condition = condition;
	}

	@Override
	public String toString()  //Arrange the result as a string ready to be printed.
	{
		return "[Designation = " + type + ", Model = " + model + ",  Price = " + price + ", Condition = " + condition+ "]"; //information we extract from function
	}
}