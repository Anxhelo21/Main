package ques1_un;


public class Runner {
	
	/** Test driver for your class. PLEASE DO NOT CHANGE IT!
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list= new LinkedList();
		
		list.add("Albi");
		list.add("Andi");
		list.add("Edona");
		list.add("Endri");
		list.add("Elona");
		list.add("Ilir");
		list.add("Elton");
		
		
		System.out.println("List containes");
		list.print();
		System.out.println("We search for Andi and andi:");
		
		if(list.contains("Andi"))
			System.out.println("Andi is in the list\n");
		else 
			System.out.println("Andi is not in the list\n");
		
		if(list.contains("andi"))
			System.out.println("andi is in the list\n");
		else 
			System.out.println("but andi is not in the list\n");
		
		
		System.out.println("We remove the head of the list");
		list.deleteFirstNode();
		System.out.println("The list without first node :");
		list.print();
		
		
		System.out.println("We add Ana");
		list.add("Ana");

		System.out.println("We remove Edona");
		list.deleteNode("Edona");
		System.out.println("The list with Ana and without Edona :");
		
		list.print();
		
		System.out.println("We remove Elton");
		list.deleteNode("Elton");
		list.print();
		
		System.out.println("We remove Albi");
		list.deleteNode("Albi");
		System.out.println("The list without Albi :");
		list.print();
		
		System.out.println("We remove Elona");
		list.deleteNode("Elona");
		System.out.println("The list without Elona :");
		list.print();
		
		System.out.println("We remove Ilir");
		list.deleteNode("Ilir");
		System.out.println("The list without Ilir :");
		list.print();
		
		System.out.println("We remove Endri");
		list.deleteNode("Endri");
		System.out.println("The list without Endri :");
		list.print();
		
		System.out.println("We remove Andi");
		list.deleteNode("Andi");
		System.out.println("The list without Andi :");
		list.print();
		
		System.out.println("We remove Ana");
		list.deleteNode("Ana");
		System.out.println("The list without Ana :");
		list.print();




	}

}
