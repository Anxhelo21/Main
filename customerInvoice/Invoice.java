package customerinvoice;
import java.util.*;
public class Invoice {
    Scanner sc = new Scanner(System.in);
    // data private fields
    private int Id;
    //Customer has all the methods from the other class
    private Customer customer;
    private double amount;
    //empty constructor which will be reading inputs from user
    public Invoice() {
        System.out.println("Please enter product Id");
        this.Id = sc.nextInt();
        System.out.println("Please enter amount");
        this.amount = sc.nextDouble();
    }
    // constructor with parameters taken from user
     public Invoice(int id, Customer consumer,double amount)
     {
         this.Id=id;
         this.customer=consumer;
         this.amount=amount;
     }
    //getter method to get product id
    public int getId() {
        return Id;
    }
    // getter method to get a customer with all the parameters
    public Customer getCustomer() {
        return customer;
    }
    // setter method to set records for the costumer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    //getter method to get amount
    public double getAmount()
    {
        return this.amount;
    }
    //setter method to set amount
    public void setAmount(double amount)
    {
        this.amount=amount;
    }
    // getter method to get costumer name
    public String getCustomerName()
    {
        return customer.getName();
    }
    // getter method to get amount after the discount is applied
    public double getAmountAfterDiscount()
    {
        return this.amount-(this.amount*customer.getDiscount()/100);
    }
    //to string method will return a string which will be printed in the end
    public String toString()
    {
        return customer+"Product Id is: "+this.Id+" its price is: "+this.amount + " and price after discount is "+this.getAmountAfterDiscount();
    }
}
