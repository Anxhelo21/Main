
public class WorkerInfoAndResult { // This class will provide the information and print the result accordingly.
    public static void main(String[] args){
    	WorkerInfo_Processing subject1=new WorkerInfo_Processing("John", 5,6,4,7,8); //Information regarding a worker
        System.out.println(subject1.result());  //Prints information processed in the other class together with the given one
        WorkerInfo_Processing subject2=new WorkerInfo_Processing("Jack", 7,3,5,7,4); //Information regarding a worker
        System.out.println(subject2.result()); //Prints information processed in the other class together with the given one
        WorkerInfo_Processing subject3=new WorkerInfo_Processing("Jill", 2,9,4,3,5); //Information regarding a worker
        System.out.println(subject3.result()); //Prints information processed in the other class together with the given one
    }
}