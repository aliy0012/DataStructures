import java.util.InputMismatchException;
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
* FoodItem class is super class, Preserve class is child
*/
public class Preserve extends FoodItem {
	private int jarSize;
	/*
	 * class variable
	 */
	
	/*
	 * class constructor
	 */
	public Preserve() {
	}
	
	@Override
	/*
	 * overriding toString method of super adding jarsize to it
	 */
	public String toString()
	{
		 return super.toString() + " size in mL: " + jarSize + "mL\n" ;
	}
	
	@Override
	/*
	 * overriding addItem method of super class asking jarsize from the user
	 */
	public boolean addItem(Scanner input) {
		super.addItem(input);
		while(true) {
			try {
				System.out.print("Enter the size of the jar in millilitres: ");
				this.jarSize = input.nextInt();
				break;				
			}catch(InputMismatchException e) {
				System.out.println("Invalid size");
				input.next();
			}
		} return true;
		
	}
}
