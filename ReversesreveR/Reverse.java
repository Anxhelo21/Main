package ReversesreveR;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Stack;

public class Reverse {
	
	public static void main(String [] args) throws FileNotFoundException
	{
		
		Stack<String> st=new Stack();
		Scanner fin= new Scanner(new FileReader("src/ReversesreveR/input.txt"));
		
		String str;
		
		while(fin.hasNext())
		{
			str=fin.next();
			st.push(str);
		}
		
		while(!st.isEmpty()) {
			System.out.print(st.pop()+ " ");
		}
	}

}
