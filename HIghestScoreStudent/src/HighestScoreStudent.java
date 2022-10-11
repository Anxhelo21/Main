import java.util.Scanner;

public class HighestScoreStudent{
	
		   public static void main(String []args) //Contains the main body of the algorithm.
		    {
			   //Below we assign 2 variables for the current score and the highest score which we give the value of 0 at first, to be latter changed by the input of the user and automatically by the algorithm.
			   double score = 0;
		       double h_score = 0;
		       //Now we assign 2 strings for the inputed name and the name of the highest scoring student.
		       String Name = null;
		       String h_Name = null;

		       Scanner input = new Scanner (System.in); //To allow the user to input information.

		       System.out.print("Enter the number of student : "); //To print out a message.
		       int nr = input.nextInt(); //The user inputs the total number of students, whose information shall be entered later.

		       for (int i=0; i<nr; i++) // A loop which will allow us to input each students necessary information, name and score.
		       {
		    	   System.out.print("\nStudent : ");
		           Name = input.next();// Inputs the students name. (Note that using any numerical value will induce an error.)
		            
		           System.out.print("Student's Score : ");
		           score = input.nextInt();//Inputs the students score. (Note that using any letters will induce an error.))

		           if (h_score<score) //'if' condition to decide the current student's score is bigger than the highest score.
		           {
		        	   h_score=score;// To replace the current highest score with another students score if condition above is fulfilled.
		        	   h_Name = Name;// To replace the current name with another students name if condition above is fulfilled.
		           }
		        }
		       System.out.print("\nBest Scoring Student: " +h_Name+ ", with the highest score of: "+h_score); //Prints the message, the name and the score of the student's with the highest score.
		     }
		}