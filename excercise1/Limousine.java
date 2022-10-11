package excercise1;

public class Limousine extends Automobile {//main function for the subclass , extends ... assigns it as a subclass
	private String title;
	public static final String Insurance = "null";//when used on later it will give the result "null".
	
	protected String status;

	public Limousine(String Brand)
	{
		super(Brand);
	}
	
	public Limousine(String Brand, String title, String insurance2){
		super(Brand);
		this.title = title;
	}

	public String getTitle() {//extract the information using this function
		return title;
	}

	public void setTitle(String title) {//assign the information extracted above to current
		this.title = title;
	}

	@Override
	public String toString() {//Arrange information to be printed
		return "Limousine [Brand = "+super.gettype()+", Title = " + title + ", Insurance = " + status + ",]";//Information is extracted from this function
	}
	

}