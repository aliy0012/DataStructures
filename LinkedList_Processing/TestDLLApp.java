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

class TestDLLApp {
	public static void main(String[] args) {

		DoublyLinkedList newLL = new DoublyLinkedList();
		/*
		 * creating doubly linked list
		 */
		/*
		 * inserting 20, 42, 63, 93 to the list
		 */
		newLL.insertFirst(93);
		newLL.insertAfter(93, 63);
		newLL.insertAfter(63, 42);
		newLL.insertAfter(42, 20);
		
		/*
		 * inserting to the rear of the list
		 */
		newLL.insertLast(9);
		newLL.insertAfter(9, 34);
		newLL.insertAfter(34, 51);
		
		/*
		 * printing forward
		 */
		newLL.printForwards();
		
		/*
		 * printing backward
		 */
		newLL.printBackwards();
		
		/*
		 * deleting first node
		 */
		newLL.deleteFirstNode();
		/*
		 * deleting last node
		 */
		newLL.deleteLastNode();
		/*
		 * search and deleting number 9
		 */
		newLL.searchAndDelete(9);
		
		/*
		 * printing outcome
		 */
		newLL.printForwards();
		
		
		/*
		 * inserting 69 after 20
		 */
		newLL.insertAfter(20, 69);
		/*
		 * inserting 77 after 34
		 */
		newLL.insertAfter(34, 77);
		/*
		 * printing outcome
		 */
		newLL.printForwards();
		

	} // end of main() method
} // end class TestDLLApp
