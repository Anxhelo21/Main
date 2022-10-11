package ques_2;
/** EPOKA UNIVERSITY
 * CEN254
 * @author F.Skuka
 * 
 * Lab 4
 * Student Name	   : Anxhelo
 * Student Surname : Hyka
 */

public class LinkedList {
	private class Node{
		private String name;
		private String surname;
		private double amount;
		private Node next;
		
		/** Constructs a new node with the specified parameters
		 * 
		 * @param name
		 * @param surname
		 * @param amount
		 * @param nextValue
		 */
		public Node(String name,String surname, double amount, Node nextValue) {
			// Your code needs to be added here
			
			this.name = name;
			this.surname = surname;
			this.amount = amount;
			this.next = next;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	private Node head;
	private Node tail;
	
	public LinkedList() {
		head=tail=null;
	}
	
	/** Adds a node in sorted manner according to the amount value. (Largest to smallest)
	 * 
	 * @param name
	 * @param surname
	 * @param amount
	 */
	public void add(String name,String surname, double amount) {
		// Your code needs to be added here
		
		
		
		
	}
	
	/** Adds a new node to the front of the list
	 * 
	 * @param name
	 * @param surname
	 * @param amount
	 */
	
	private void add2First(String name,String surname, double amount) {
		head = new Node(name, surname, amount, head);
	}
	
	/** Adds a new nod to the end of the List
	 * 
	 * @param name
	 * @param surname
	 * @param amount
	 */
	private void add2Last(String name,String surname, double amount) {
		tail = tail.next = new Node(name, surname, amount, null);
	}
	
	/** returns the previous node.
	 * 
	 * @param amount
	 * @return
	 */
	private Node findPrev(double amount) {
		return head;
		// Your code needs to be added here
		
	}
	
	/** Prints the entire list
	 * 
	 */
	public void printList() {
		Node tmp=head;
		while(tmp!=null) {
			System.out.println(tmp.name + " " + tmp.surname+" "+ tmp.amount);
			tmp=tmp.next;
		}
		
	}
	
	/** Prints the content of the first n nodes in the linked list
	 * 
	 * @param n
	 */
	public void pritntFirstN(int nrDon) {
		// Your code needs to be added here
		
		Node tmp=head;
		while(tmp!=null) {
			for(int i=0; i<nrDon; i++) {
				System.out.println(tmp.name + " " + tmp.surname+" "+ tmp.amount);
				tmp=tmp.next;
			}
		}
		
		
		
		
	}
	
}
