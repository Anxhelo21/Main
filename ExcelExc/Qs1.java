package Ques_1;

public class Qs1 {

	public static String func_01(long n) {
		char c = '*';
		StringBuilder sb = new StringBuilder();
		for (long j = 0; j < n; j++) {
			// if(n>500000000)
			// sb = new StringBuilder();
			sb.append(c);
		}
		return sb.toString();
	}

	/// O(n^2)
	public static String func_02(long n) {
		char c = '*';
		StringBuilder sb = new StringBuilder();
		
		for (long j = 1; j <= n; j++) {
			
			String temp = func_01(n);
		}
		return sb.toString();
	}

	public static String func_03(long n) {
		char c = '*';
		StringBuilder sb = new StringBuilder();
		for (long j = 0; j < n; j++) {
			
			String temp = func_02(n);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long n ;
		int trials ; 
		
		System.out.println("\nFunction1()");
		n = 50000;
		trials = 5; // 20
		
		for (int t = 0; t < trials; t++) {
			long startTime = System.currentTimeMillis();

			String temp = func_01(n);

			long endTime = System.currentTimeMillis();
			long elapsed = endTime - startTime;

			System.out.println(String.format("%2d.trail, n: %13d took %7d milliseconds", t + 1, n, elapsed));
			n *= 2; // double the problem size
		}
		

		System.out.println("\nFunction2()");
		n = 500;
		trials = 7; 
		
		for (int t = 0; t < trials; t++) {
			long startTime = System.currentTimeMillis();

			String temp = func_02(n);

			long endTime = System.currentTimeMillis();
			long elapsed = endTime - startTime;

			System.out.println(String.format("%2d.trail, n: %13d took %7d milliseconds", t + 1, n, elapsed));
			n *= 2; // double the problem size
		}

		
		
		

		System.out.println("\nFunction3()");
		n = 10;
		trials = 10; 
		
		for (int t = 0; t < trials; t++) {
			long startTime = System.currentTimeMillis();

			String temp = func_02(n);

			long endTime = System.currentTimeMillis();
			long elapsed = endTime - startTime;

			System.out.println(String.format("%2d.trail, n: %13d took %7d milliseconds", t + 1, n, elapsed));
			n *= 2; // double the problem size
		}


	}

}