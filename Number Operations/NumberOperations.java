import java.util.Scanner;

class NumberOperations {
	
public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
    	System.out.println("[Factorial] - Enter a number: ");
		int n = input.nextInt();
		System.out.println("[Factorial] - The factorial for " + n + " is: " + factorial(n));
		
		System.out.println("\n[Fibbonaci] - Enter a number: ");
		int m = input.nextInt();
		System.out.println("[Fibbonaci] - The result is: "+fibbonaci(m));
		
    	System.out.println("\n[Power] - Enter the base(x) and the exponent(y) : ");
        int x = input.nextInt();
        int y = input.nextInt();
        System.out.printf("[Power] - The result is: %d",power(x,y));
        
        System.out.println("\n[Sum of Numbers] - Enter a number: ");
		int a = input.nextInt();
        System.out.println("[Sum of Numbers] - Sum of digits in numbers "+" from 1 to " +a+ " is: "+SumOfAllNumbers(a)+".");
        
        System.out.println("\n[Sum of Odd Numbers] - Enter a number: ");
		int start = input.nextInt();
		System.out.println("[Sum of Odd Numbers] - Enter a second number: ");
		int finish = input.nextInt();
        System.out.println("[Sum of Odd Numbers] - Sum of Odd Numbers between "+start+" and "+finish+" is: "+oddSum(start,finish));
	}

    public static int factorial(int n)
    {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }
    
    public static int fibbonaci(int m) {
		if (m <= 1)
			return m;
		return fibbonaci(m-1) + fibbonaci(m-2);
	}
    
    public static int power(int x, int y)
    {
        if (y==0) {
            return 1;
           }
        
        if (x==0) {
            return 0;
           }
        return x*power(x,y-1);
    }
    
    static int SumOfAllNumbers(int c)
    {
        int result = 0;
        for (int a = 1; a <= c; a++)
            result += NumbersSum(a);
        return result;
    }
    
    static int NumbersSum(int a)
    {
        int sum = 0;
        while (a != 0)
        {
        	sum += a%10;
            a = a/10;
        }
        return sum;
    }
    
    public static int oddSum(int start, int finish)
    {
        int sum = 0;
        for (int i = start; i < finish; i++){
        	if(i % 2 != 0) {
        		sum = sum+i;
        	}
        }
        return sum;
    }
}
