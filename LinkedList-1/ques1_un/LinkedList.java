package ques1_un;


public class LinkedList {
	private Node head;

	public LinkedList() {
		head = null;
	}

	void add(String name) {
		head = new Node(name, head);
	}

	/**
	 * Removes the head node and returns true if the list contains at least one
	 * node. Returns false if the list is empty.
	 */
	public boolean deleteFirstNode() {

		// Your code needs to be added here
		// Store head node
        Node temp = head;
        head = temp.getNext();   // Change head
	
		return true;
	}

	/**
	 * Returns the number of nodes in the list.
	 */
	public int size() {
		// Your code needs to be added here

		int count = 0;
        Node position = head;

        while (position != null)
        {
            count++;
            position = position.getNext( );
        }
        return count;
	}

	public boolean contains(String item) {
		return (find(item) != null);
	}

	/**
	 * Finds the first node containing the target item, and returns a reference to
	 * that node. If target is not in the list, null is returned.
	 */
	private Node find(String target) {
		
		Node position = head;
		String itemAtPosition;
		while (position != null) {
			itemAtPosition = position.getName();
			if (itemAtPosition.equals(target))
				return position;
			position = position.getNext();
		}
		return null; // target was not found
	}

	
	public boolean deleteNode(String target) {
		// Your code needs to be added here
		Node pos = find(target);
			if(pos == null )
				return false;
			if(pos == head) {
				deleteFirstNode();
			}
				
			Node prev = head; 
			if(head == null) {
				return true;
			}
			Node next = head.getNext(); 
				
			while(next != pos) {	
				prev=next;
				next=next.getNext();
				}
			
			prev.setNext(next.getNext());
				
		return true;
	}
	

	void print() {
		// Your code needs to be added here
		Node position = head;
        if(head==null)
        {
        	System.out.println("The list is empty.");
        	return;
        }
        while (position != null)
        {
            System.out.print(position.getName() + " ");
            position = position.getNext( );
        }
        System.out.print("\n");

	}
}
