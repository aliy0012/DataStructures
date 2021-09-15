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
 * FoodItem class is super class, Vegetable class is child
 */
public class Vegetable extends FoodItem {
	private String farmName;
	/*
	 * class variable
	 */
	public Vegetable() {	
	}
	
	@Override
	/*
	 * overriding toString method in Super adding farmname to it
	 */
	public String toString() {
		 return super.toString() + " farm supplier: " + farmName +"\n";
	}
	
	@Override
	/*
	 * Overriding addItem method of super class asking farmname input from user
	 */
	public boolean addItem(Scanner input) {
		super.addItem(input);
		System.out.print("Enter the name of farm supplier: ");
		this.farmName = input.nextLine();
		return true;
	}
}
