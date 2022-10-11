package customerinvoice;
//writing a class Customer
import java.util.*;
public class Customer {
    //private data fields
    private int Id;
    private String name;
    private int discount;

    Scanner sc = new Scanner(System.in);
    // empty constructor which will read attributes from user
    public Customer(){
        System.out.println("Please enter Id of customer");
        this.Id = sc.nextInt();
        System.out.println("Please enter name of customer");
        this.name = sc.next();
        System.out.println("Please enter discounted benefited from this costumer");
        this.discount = sc.nextInt();
    }
    // a constructor which takes arguments from main
    public Customer(int Id,String name,int discount)
    {
        this.Id=Id;
        this.name=name;
        this.discount=discount;
    }
    //getter method to get id
    public int getId()
    {
        return this.Id;
    }
    //getter method to get Name
    public String getName()
    {
        return this.name;
    }
    // getter method to get Discount
    public int getDiscount()
    {
        return this.discount;
    }
    //setter method to set name to the name given from main
    public void setName(String name)
    {
        this.name=name;
    }
    // setter method to set id
    public void setId(int Id)
    {
        this.Id=Id;
    }
    //setter method to set discount
    public void setDiscount(int discount)
    {
        this.discount=discount;
    }
    // this will be printed if we print inside main only the class
    public String toString()
    {
        return "Costumer name is: " +this.name + " with ID: "+this.Id + " discount applied will be "+this.discount+"%"+ "\n";
    }

}
