import java.util.*;

public class InfoAndResult {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in); //Necessary to allow the user to input information
        
        //Assign the variables below as integer and allow the user to enter information for each of them in given order
        int num1 = scanner.nextInt();
        int d_nom1 = scanner.nextInt();
    
        int num2 = scanner.nextInt();
        int d_nom2 = scanner.nextInt();
    
        int num3 = scanner.nextInt();
        int d_nom3 = scanner.nextInt();
        
        //Below we assign and print the result
        InforPorcess result1 = new InforPorcess(num1, d_nom1);
        InforPorcess result2 = new InforPorcess(num2, d_nom2);
        InforPorcess result3 = new InforPorcess(num3, d_nom3);
        
    
        System.out.println(result1.Ratio_calc() + result2.Ratio_calc() + result3.Ratio_calc()); //Prints the processed information from the other class
        scanner.close();
    }
}
