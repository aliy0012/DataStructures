import java.util.Scanner;
/* Assignment 1
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
/*
 * FoodItem class is super class, Fruit class is child
 */
public class Fruit extends FoodItem {
	private String orchardName;
	/*
	 * class variable
	 */
	
	/*default constructor*/
	public Fruit() {
	}
	
	@Override
	/*
	 * overriding toString method of super class, ading orchard Name to it
	 */
	public String toString() {
		 return super.toString() + " orchard supplier: " + orchardName + "\n" ;
	}
	
	@Override
	/*
	 * overriding addItem method of super class asking orchard supplier from the user
	 */
	public boolean addItem(Scanner input) {
		super.addItem(input);
		System.out.print("Enter the name of orchard supplier: ");
		this.orchardName = input.nextLine();
		return true;
	}
}
