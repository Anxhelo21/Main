package ArrayExercise;

import java.util.Scanner;

public class ArrayOperations {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	    
		System.out.print("Enter the number of array elements: ");
		int n = sc.nextInt();  
	    int data[] = new int[n];
	    System.out.println("The sum of the "+n+" elements in the array is: "+arraySum(data,n)+".");
	    
	    System.out.print("\nEnter the number of array elements: ");
		int a = sc.nextInt();  
	    int arr[] = new int[a];
	    System.out.println("- these are the "+printArray(arr,a)+" elements you entered.");
	    
	    System.out.print("\nEnter the number of array elements: ");
		int b = sc.nextInt();  
	    int array[] = new int[b];
	    System.out.print("Enter the elements of the array: ");
	    for(int i = 0; i < b; i++)
	    {
			array[i] = sc.nextInt();
	    }
        RevArray(array, 0, b-1);
        System.out.println("The array in reversed order is: ");
        ArrayPrint(array, b);
        }
	
	
	public static int arraySum(int data[],  int n) {
		Scanner sc = new Scanner(System.in);
	    int sum = 0;
	    System.out.println("Enter all the elements:");
	    for(int i = 0; i < n; i++){
	    	data[i] = sc.nextInt();
			sum += data[i];
	    }
		return sum;
	}
	
	
	public static int printArray(int data[], int a){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter all the elements:");
		int i;
		for(i = 0; i < a; i++){
			data[i] = sc.nextInt();
			System.out.print(data[i] + " ");
			}
		return i;
        }
	
	
	public static void RevArray(int array[], int l, int r)
    {
        int k;
        if (l >= r) 
        {
            return;
        }
        k = array[l];
        array[l] = array[r];
        array[r] = k;
        RevArray(array, l+1, r-1);
    }
 
    
    public static void ArrayPrint(int array[], int m)
    {
    	int i;
        for (i=0; i<m; i++) 
        {
            System.out.print(array[i]+" ");
        }
    }
}
