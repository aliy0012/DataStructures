/**
 * Processing data using Doubly Linked List CST8130 Data Structures,
 * Computer Engineering Technology-Computer Science: Level 3
 * 
 * Professor: James Mwangi PhD
 * 
 * 
 *          Student Name: Ali Aliyev
 * 			Student ID: 41013373
 * 
 */

//===================== class starts here=============================
class Node {
	public int mData; // data item
	public Node next; // next node in list
	public Node previous; // previous node in list
// -------------------------------------------------------------

	public Node(int d) // constructor
	{
		mData = d;
	}

// -------------------------------------------------------------
	// display this node data
	public void displayNode() {
		System.out.print(mData + " ");
	}
// -------------------------------------------------------------
} // end class Node

//===================== class design starts here =============================
class DoublyLinkedList {
	private Node first;
	private Node last;

// -------------------------------------------------------------
	public DoublyLinkedList() {
		first = null;
		last = null;
	}

// -------------------------------------------------------------
	public boolean isEmpty() {
		return first == null;
	}

// -------------------------------------------------------------
	public void insertFirst(int num) {
		Node newNode = new Node(num);

		if (isEmpty())
			last = newNode;
		else
			first.previous = newNode;
		newNode.next = first;
		first = newNode;
	}

// -------------------------------------------------------------
	public void insertLast(int num) {
		Node newNode = new Node(num);
		if (isEmpty())
			first = newNode;
		else {
			last.next = newNode;
			newNode.previous = last;
		}
		last = newNode;
	}

	// insert newNumber just after numToFind
	public boolean insertAfter(int numToFind, int newNumber) { // (assumes non-empty list)
		Node current = first;
		while (current.mData != numToFind) {
			current = current.next;
			if (current == null)
				return false;
		}
		Node newNode = new Node(newNumber);

		if (current == last) {
			newNode.next = null;
			last = newNode;
		} else {
			newNode.next = current.next;

			current.next.previous = newNode;
		}
		newNode.previous = current;
		current.next = newNode;
		return true;
	}
	
//------------------------------------------------// delete first node

	public Node deleteFirstNode() {
		/*
		 * deleting first node method
		 */

		Node deleted = first;
		first = first.next;
		return deleted;
	}

// -----------------------------------------------// delete last node

	public Node deleteLastNode() {
		/*
		 * deleting last node method
		 */

		Node deleted = last;
		last = last.previous;
		last.next = null;
		return deleted;

	}

// -------------------------------------------------------------

// -----------------------------------------finds, deletes and returns the node that contains the given int value
	public Node searchAndDelete(int number) {

		/*
		 * search and delete method
		 */
		Node current = first;
		while (current.mData != number) {
			current = current.next;
			if (current == null)
				return current;
		}

		/*
		 * if the searched element is last
		 * deleteLastNode called
		 */
		if (current == last) {
			deleteLastNode();
		}else if(current == first) {
			/*
			 * if searched element is first
			 * deleteFirst elmenet called
			 */
			deleteFirstNode();
		}
		else {
			/*
			 * if not first or last, searched elemnt node is deletde via connecting previous and next link nodes
			 */
			current.next.previous = current.previous;
			current.previous.next = current.next; 
		}
		return current;
	}

	

// -------------------------------------------display data from first node to last node
	public void printForwards() {
		/*
		 * printing forward method
		 */

		Node temp = first;
		System.out.print("Linked List: [From first_to_last]: ");
		/*
		 * while loop printing till the next element is null
		 */
		while(temp != null) {
			System.out.print(temp.mData + " ");
			temp = temp.next;
		}
		System.out.println();
		System.out.println();

	}

// -------------------------------------------display data from last node  to first node
	/*
	 * printing backward method
	 */
	public void printBackwards() {

		Node temp = last;
		System.out.print("Linked List: [From first_to_last]: ");
		/*
		 * while loop going through till the previous element is null
		 */
		while(temp != null) {
			System.out.print(temp.mData + " ");
			temp = temp.previous;
		}
		System.out.println();
		System.out.println();

	}
// -------------------------------------------------------------
} // end class DoublyLinkedList

// ==========================================================
