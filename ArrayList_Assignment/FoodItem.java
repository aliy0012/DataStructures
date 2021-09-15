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
public class FoodItem {
	/*
	 * class variables
	 */
	protected int itemCode;
	protected String itemName;
	protected float itemPrice;
	protected int itemQuantityInStock;
	protected float itemCost;
	
	/*
	 * class constructor
	 */
	public FoodItem() {
	
	}
	
	/*
	 * toString method to print elements
	 */
	@Override
	public String toString() {
		
		return ("Item: " + itemCode + " " + itemName +" "+ itemQuantityInStock + " Price: $" + itemPrice + " Cost: $" + itemCost);
	}
	
	/*
	 * updateing item method
	 */
	public boolean updateItem(int amount) {
		
		if(itemQuantityInStock + amount < 0) {
			return false;
		}
		/*
		 * adding entered amount to the stock
		 */
		itemQuantityInStock += amount;
		return true;
		
		
	}
	/*
	 * isEqual method
	 */
	public boolean isEqual(FoodItem item) {
		return item.itemCode == itemCode;
	}
	
	public boolean addItem(Scanner input) {
		
		/*
		 * while loop for getting class variables assigned
		 */
		while(true) {
			try {
				System.out.print("Enter the code for the item: ");
				this.itemCode = input.nextInt();
				input.nextLine();
				break;
			}catch(InputMismatchException e1) { //try catch method to catch bad input
				System.out.println("Invalid code");
				input.next();
			}
		}
		
			System.out.print("Enter the name for the item: ");
			this.itemName = input.nextLine();
			
		
		while(true) {
			try {
				System.out.print("Enter the quantity for the item: ");
				this.itemQuantityInStock = input.nextInt();
					if(itemQuantityInStock <= 0) {
						System.out.println("Invalid code");
						continue;
					}
				break;
			}catch(InputMismatchException e2) { //try catch method to catch bad input
				System.out.println("Invalid quantity");
				input.next();
			}
		}
		
		while(true) { //try catch method to catch bad input
			try {
				System.out.print("Enter the cost of the item: ");
				this.itemCost = input.nextFloat();
					if(itemCost <= 0) {
						System.out.println("Invalid cost");
						continue;
					}
					break;
			}catch(InputMismatchException e2) {
				System.out.println("Invalid cost");
				input.next();
			}
		}

		while(true) {
			try {
				System.out.print("Enter the sales price of the item: ");
				this.itemPrice = input.nextFloat();
				input.nextLine();
					if(itemPrice <= 0) {
						System.out.println("Invalid price");
						continue;
					}
					break;
			}catch(InputMismatchException e4) { //try catch method to catch bad input
				System.out.println("Invalid price");
				input.next();
			}
		} return true;
		
	}
	
	/*
	 * getting item input code
	 */
	public boolean inputCode(Scanner input) {
		
		System.out.print("Enter item code: ");
		try {
			itemCode = input.nextInt();
		}catch(InputMismatchException e5) {
			System.out.println("Invalid code");
			input.next();
			return false;
		}
		return true;
	}

}
