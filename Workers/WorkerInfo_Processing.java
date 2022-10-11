
public class WorkerInfo_Processing //This class will be processing the information and handling the calculations
{
    private String name;  
    private int []hours;

    public WorkerInfo_Processing(String name,int... hours){
        this.name=name;
        this.hours=hours;
    }
    public String W_Name() {
        return this.name;
    }    
    public void Name(String name) {
        this.name=name;
    } 
    public int[] W_Hrs() {
        return this.hours;
    }
    public void Hrs(int[] hours){
        this.hours=hours;
    }
    
    public String result() { //This function will be used to arrange and print the information gathered below
        String curr_Worker="The worker is : " + this.name + " and his current hours are : " ; //Prints the line together with the information
        int i; //counter
        for (i=0;i<5;i++) { //loop to count each digit/hour
        	curr_Worker+=(hours[i] + ","); //prints the hours of each worker in turn according to the counter above
        }
        curr_Worker +=". Information about the worker - Average Hours: " + this.HrsAvg(hours)+ ", Average Pay: " + this.PaymentAvg(hours)+ ", Total Pay: " +this.PaymentTotal(hours);
        //above we print given information and processed information by each function.
        return curr_Worker; // The information we extract from the function
    }
    
    public float PaymentAvg(int[] hours) { //This function will calculate the average payment	
        float d_avg;	//Assign daily average as float - d_avg	
        int sum=0; //Assign sum as integer and give it the value of 0.
        int i;
        for (i=0;i<5;i++) 
        {
            sum += hours[i]; //Sum will gather the total sum of all hours for current worker
        }
        d_avg=(sum *6.5f)/5.0f; //Calculate the daily average
        return d_avg; //Information we extract from the function
    }
    
    public float HrsAvg(int[] hours) { //This function will calculate the average hours of work	
        float d_avg; //Assign daily average as float - d_avg	
        int tot=0; //Assign total as integer and give it the value of 0.
        int i;
        for(i=0;i<5;i++) 
        {
            tot+=hours[i];//tot will gather the total sum of all hours for current worker
        }
        d_avg = tot/5.0f; //Calculate the daily average 
        return d_avg; //Information we extract from the function
    }
    
    public float PaymentTotal(int[] hours){//This function will calculate the average hours of work
        float PayTot=0 ;//Assign the total payment as float and give it the value of 0 as it will be used for calculations below.
        int i;
        for(i=0;i<5;i++){
        	PayTot+=(hours[i] *6.5);  //Calculate the total payment
        }
        return PayTot; //Information we extract from the function
    }
}