package Ques_2;


import java.util.*;
import java.io.*;

class Node {
	int val;
	Node left, right;

	Node(int v) {
		val = v;
		left = right = null;
	}
}


public class Qs2 {
	
	

	static Node Insert(int v, Node top) {
		if (top == null)
			top = new Node(v);
		else if (top.val < v)
			top.right = Insert(v, top.right);
		else if (top.val > v)
			top.left = Insert(v, top.left);

		return top;
	}
	
	static int sum;
	
	static void leafSum(Node root){
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            sum += root.val;
        leafSum(root.left);
        leafSum(root.right);
    }
       

	
	public  static Node FindMin(Node T) {
		if (T == null)
			return null;
		if (T.left == null)
			return T;
		return FindMin(T.left);
	}

	public static  Node FindMax(Node T) {
		if (T == null)
			return null;
		while (T.right != null)
			T = T.right;
		return T;
	}
	
	

	public static void main(String[] args) throws IOException {
		//Scanner in = new Scanner(new FileReader("input.txt")); // 
		Scanner in = new Scanner(System.in); 
		int num, n = in.nextInt();
		sum = 0;
		
		Node root = null;

		for (int i = 0; i < n; i++) {
			num = in.nextInt();
			root = Insert(num, root);
		}
		
		Node MaxNode=FindMax(root);
		System.out.println("Max is: "+ MaxNode.val);
		Node MinNode=FindMin(root);
		System.out.println("Min is: "+ MinNode.val);
        leafSum(root);
        System.out.println("Sum of the leaf nodes is: "+sum);
	}

}