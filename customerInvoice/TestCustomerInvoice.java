package customerinvoice;

public class TestCustomerInvoice {
    public static void main(String[] args)
    {
        // creating a customer class with 0 parameters so we will get those from the console
        Customer consumer = new Customer();
        // creating a customer class with parameters given directly
        Customer consumer1 = new Customer(40,"Jack",7);
        // creating an invoice class with no parameters so we will get the from console
        Invoice invoice = new Invoice();
        // using setCustomer method we will chose which customer from the two created will give to user
        invoice.setCustomer(consumer);
        // then we will print where we expect to get client id, name, discount product id and price after discount
        System.out.println(invoice);
    }// we could have given the parameters using setter methods and then printing the output as well but to keep it more
    //interacting in the console I kept it this way
}
