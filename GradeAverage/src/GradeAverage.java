import java.util.Scanner;

public class GradeAverage {
	
	public static void main(String[] args){//Contains the main body of the algorithm.
		Scanner input=new Scanner(System.in);// Allows the user to input information
		
		System.out.println("Enter the Homework grades : ");
		//This shows as each grade the user inserts is assigned a specific integer, namely: g1, g2 and g3.
			int g1 = input.nextInt();
			int g2 = input.nextInt();
			int g3 = input.nextInt();
			//Below we assign declare 'h_avg' as 'double' as it will contain the average that the homework grades make up in the total grade average.
			//We use double or float because 'h_avg' will have to be calculated by the algorithm.
			double h_avg = 0;		
		
			System.out.println("Enter the Quiz grades : ");
			//Each grade we insert is assigned a specific integer: g4 and g5.
			int g4 = input.nextInt();
			int g5 = input.nextInt();
			//Below we declare 'q_avg' as 'double' as it will contain the average that the quiz grades make up in the total grade average.
			double q_avg = 0;
		
			System.out.println("Enter the Mid-Term Exam grade : ");
			int g6 = input.nextInt();
			//Below we declare 'mt_avg' as 'double' as it will contain the average that the Mid-Term Exam grade makes up in the total grade average.
			double mt_avg = 0;
		
			System.out.println("Enter the Project grade : ");
			int g7 = input.nextInt();
			//Below we declare 'p_avg' as 'double' as it will contain the average that the Project grade makes up in the total grade average.
			double p_avg = 0;
		
			System.out.println("Enter the Final Exam grade : ");
			int g8 = input.nextInt();
			//Below we declare 'f_avg' as 'double' as it will contain the average that the Final Exam grade makes up in the total grade average.
			double f_avg = 0;
			//Below we declare 'total_avg' as 'double' as it will contain the total grade average of the student depending on the inputed grades.
			double total_avg = 0;
			
			
			h_avg = (g1 * 0.016) + (g2 * 0.016) + (g3 * 0.016);
			//Will calculate the average that the 3 homework grades take in the total grade. (3 grades = 5% of total grade, 0.05 / 3 = 0.016, each grade takes up 1.6% of the total grade.)
			
			q_avg = (g4 * 0.05) + (g5 * 0.05);
			// Will calculate the average that the 2 quiz grades take in the total grade. (2 grades = 10% of total grade, 0.1 / 2 = 0.05, each grade takes up 5% of the total grade.)
			
			mt_avg = (g6 * 0.20);
			// Will calculate the average that the Mid-Term Exam grade takes in the total grade. (1 grade = 20% or 0.20)
			
			p_avg = (g7 * 0.25);
			// Will calculate the average that the Project grade takes in the total grade. (1 grade = 25% or 0.25)
			
			f_avg = (g8 * 0.40);
			// Will calculate the average that the Project grade takes in the total grade. (1 grade = 40% or 0.40)
			
			total_avg= (h_avg + q_avg + mt_avg + p_avg + f_avg);
			// Will calculate the average score of the student using the given input and calculations made above.
			
			System.out.printf("The final average is: %.2f",total_avg);
			//Will print the result of the student's final average , showing only 2 digits after the decimal point.
			
			}
	}