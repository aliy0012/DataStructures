import java.util.Arrays;
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

public class Inventory {
	/*
	 * class variables
	 * array object of foodItems of FoodItem class
	 */
	private int numItems;
	private FoodItem[] foodItems;
	
	/*
	 * class constructor, creating FoodItem array object consist of 20 elements
	 */
	public Inventory() {
		this.foodItems = new FoodItem[20];
		this.numItems = 0;
		
	}
	
	
	@Override
	/*
	 * overriding general toString method, looping through each array elements and concatenating the in string
	 */
	public String toString() {
		
		String toString = "Inventory:\n" ;
		for(int i=0; i<numItems; i++)
			toString += foodItems[i].toString();
		return toString;
	}
	
	
	/*
	 * already exist method looping through array elements if match is found returning index of the match
	 */
	public int alreadyExists(FoodItem item) {
		
		for(int i = 0; i < numItems; i++) {
			if(item.itemCode == foodItems[i].itemCode)
				return i;
		}
		return -1;
	}
	
	/*
	 * addItem method to assign inputs from user fruit, vegetable or preserve class
	 */
	public boolean addItem (Scanner input) {
		
		FoodItem item = null;
		
		while(true) {
			System.out.print("Do you wish to add a fruit(f), vegetable(v), or a preserve(p)? ");
			String entry = input.next();
		
		if(entry.equals("f") || entry.equals("F")) {
			item = new Fruit();
			item.addItem(input);
			break;
			
		}else if(entry.equals("v") || entry.equals("V")) {
			item = new Vegetable();
			item.addItem(input);
			break;
			
		}else if(entry.equals("p") || entry.equals("P")) {
			item = new Preserve();
			item.addItem(input);
			break;
			
		}else
			{System.out.println("Invalid entry");}
		}
		
		foodItems[numItems] = item;
		numItems++; //iterating numItems every time method is called
		return true;
	}
	
	/*
	 * updating Quntity method, if buyOrSell is true - buy, other case it is sell
	 */
	public boolean updateQuantity(Scanner input, boolean buyOrSell) {
			
		FoodItem updatedItem = new FoodItem();
		updatedItem.inputCode(input);
		
		int index;
		index = alreadyExists(updatedItem);
		
		if(index == -1) {
			System.out.println("Code not found in inventory..");
			return false;
		}
		
		try {
			if(buyOrSell) {
				System.out.print("Enter valid quantity to buy: ");
			}else if(!buyOrSell) {
				System.out.print("Enter valid quantity to sell: ");
			}
				
				int quantity = input.nextInt();
						
					if(quantity <= 0) {
						System.out.println("Invalid quantity..");
						return false;
					}
					if(!buyOrSell) {
						quantity = quantity * -1;}
	
					if(!foodItems[index].updateItem(quantity)) {
						System.out.println("Insufficent stock in inventory..");
						return false;
					}
			
			
			return true; 
			}catch(InputMismatchException e7) { //try catch method to capture bad input
				System.out.println("Invalid quantity..");
				return false;
			}
			
		}
		
	}


