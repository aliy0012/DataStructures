import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * CET - CS Academic Level 3
 * This class contains the dynamically allocated array and it's processing
 * Student Name: Ali Aliyev
 * Student Number: 041013373
 * Course: CST8130 - Data Structures
 * @author/Professor: James Mwangi PhD. 
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
public class Lab1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws NullPointerException, InputMismatchException {
		/*
		calling displayMainMenu method
		 */
		displayMainMenu();
		
	}

	private static void displayMainMenu() throws NullPointerException, InputMismatchException {
		/*
		Initializing scanner
		 */
		Scanner my = new Scanner(System.in).useDelimiter("\\n");
		Numbers numbers1 = new Numbers(3);  //creating object from Numbers class
		int selection;

		do {  //do while loop for menu selection

			System.out.print("Please select one of the following:\n"
					+ "1. Initialize a default array\n"
					+ "2. To specify the max size of array\n"
					+ "3. Add value to the array\n"
					+ "4. Display values in the array\n"
					+ "5. Display average of the values, minimum value, maximum value\n"
					+ "6. To Exit   : ");

			try {  //try catch block, to catch bad input
				selection = my.nextInt();


				switch (selection) {
					case 1:  //in menu selection 1 array is initialized
						System.out.println("Array initialized");
						numbers1 = new Numbers(1);
						break;
					case 2:  //menu selection 2 will create a new array with the max array size
						System.out.print("Enter max size of array: ");
						int maxSize = my.nextInt();
						numbers1 = new Numbers(maxSize);
						break;
					case 3:  //menu selection 3 will add elements to array
						numbers1.addValue(my);
						break;
					case 4: //menu selection 4 will print elements
						numbers1.toStringMethod();
						break;
					case 5:  //menu selection 5 will calculate average, min and max
						if (numbers1 != null) {
							numbers1.findMinMax();
						}
						break;
					case 6:  //menu selection 6 will exit the program
						System.out.println("Exiting ..");
						my.close();
						System.exit(0);
						break;
					default:  //for any other selection
						System.out.println("Please select from menu");
						break;
				}
			}catch (InputMismatchException e1){  //catch bloc for bad inputs
				System.out.println("Please enter correct number");
				my.next();
			}catch(IllegalArgumentException e6){
				System.out.println("Please enter correct number");
				my.next();
			}
			} while (true) ;
	}
}