package ques_2;
import java.util.Scanner;

public class Solver {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nrDon, ntop;
		String name, surname;
		double amount;
		LinkedList list = new LinkedList();
		Scanner scan=new Scanner(System.in);

		nrDon=scan.nextInt();
		ntop=scan.nextInt();
		LinkedList [] myList = new LinkedList[nrDon];
		// Declare other variables
		
		// Read the number of donors and the number of donors to be displayed
		for (int i=0; i<nrDon ; i++) {
			//read  name, surname and ammount
			name=scan.next();
			surname=scan.next();
			amount=scan.nextDouble();
			list.add(name, surname, amount);
		}
		// Print the first top M donors.
		
	}
}
