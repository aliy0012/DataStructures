import java.util.InputMismatchException;
import java.util.Scanner;

/** Lab 5
* Student Name: Ali Aliyev
* Student Number: 041013373
* Course: CST8130 - Data Structures
* CET-Level 3
* @author/Professor James Mwangi PhD. 
* 
 */
/**
* CET - CS Academic Level 3
* Declaration: I declare that this is my own original work and is free from Plagiarism
* This class contains the dynamically allocated array and it's processing
* Student Name: Ali Aliyev
* Student Number: 041013373
* Section #: 300
* Course: CST8130 - Data Structures
* @author/Professor: James Mwangi PhD.
*
*/


/**
 * Tests the BinaryTree and Node class.
 */
public class BinaryTreeTest {
	/**
	 * creating object from class
	 */
	static BinaryTree tree = new BinaryTree();
	
	/**
	 * menu method to display menu slection
	 * looping
	 * and try catch method, to catching bad entry
	 */
	public static void showMenu() {
		Scanner input = new Scanner(System.in);
		int selection;
		int choice;
	
		do {
			try {
				System.out.println("\n1: Add value to Tree");
				System.out.println("2: Display Tree (Pre-order Traversal)");
				System.out.println("3: Display Height");
				System.out.println("4: To Exit");
				System.out.print("> ");
				selection = input.nextInt();
				

			switch (selection) {
			/**
			 * adding to the tree
			 */
			case 1:{
				System.out.print("Enter an integer to add to the tree: ");
				choice = input.nextInt();

				tree.insertInTree(choice);
				break;}
			/**
			 * pre-order display
			 */
			case 2:{
				System.out.print("Pre-order Tree Traversal\n");
				tree.displayPreOrder();
				break;}
			/**
			 * showing height of the tree
			 */
			case 3:{
				System.out.print("Tree Height \n"+ tree.height(tree.root));
				break;}
			/**
			 * exiting from the program
			 */
			case 4:{
				System.out.println("Exiting...");
				input.close();
				/**
				 * scanner closed
				 */
				System.exit(0);}
			default:{
				/**
				 * if non of the menu option selected, showing error message
				 */
				System.out.println("Invalid entry. Try again");
				break;}

			}
			/**
			 * catch body
			 */
		} catch (InputMismatchException e) {
			input.next();
			System.out.println("Invalid entry");
		}

	} while (true);
		
	}
	
	/**
	 * main program
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * showMenu method is called
		 */
		showMenu();
			
}
	}

