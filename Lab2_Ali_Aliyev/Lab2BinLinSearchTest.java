import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lab2
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

public class Lab2BinLinSearchTest {

    public static void main(String[] args ) throws ArrayIndexOutOfBoundsException{
    	/*
    	 * variables for class, and calling scanner
    	 */
        int selection;
        int first = 0;
        int last = 29;
        int size = 30;
        Scanner input = new Scanner(System.in);//.useDelimiter("\\n"); 
        BinaryLinearSearch test = new BinaryLinearSearch(); //creating new object from the class

        do{ //do while loop for looping the menu, till the Exit selected
            System.out.print("\nSelect yout option in the menu below:\n"
                    + "1. Initialize and populate an array of 30 random integers.\n"
                    + "2. Perform a recursive binary and linear search.\n"
                    + "3. Perform iterative binary and linear seaarch\n"
                    + "4. Exit.\n");
            
            try {  //try catch method to catch the input mismatch
            selection = input.nextInt();
            

            switch (selection){  //switch statement for entered menu selection
                case 1:
                    System.out.println("Array of randomly generated integers:"); //f 1 selected array is initialized
                    test.generateRandomInts(); //array elements filled by generate random method
                    break;
                case 2:
                    System.out.print("Please enter an integer value to search: ");
                    int searchkey = input.nextInt();
                    long startT = System.currentTimeMillis();  //staring currenttimemilis and nanotime method
                    long time = System.nanoTime();
                    test.recursiveBinarySearch(first, last, searchkey); //calling recursive binary method
                    long endT = System.currentTimeMillis();
                    long endN = System.nanoTime();
                    System.out.println("Time taken in nanoseconds: " + (endN - time)); //calculating process of time taken by method
                    System.out.printf("Time taken in milliseconds: %d%n" , (endT - startT));
                    test.recursiveLinearSearch(size, searchkey); //calling recursive linear method
                    endT = System.currentTimeMillis();
                    endN = System.nanoTime();
                    System.out.println("Time taken in nanoseconds: " + (endN - time));
                    System.out.printf("Time taken in milliseconds: %d%n" , (endT - startT));
                    break;
                case 3:
                    System.out.print("\nPlease enter an integer value to search: ");
                    int searchKey = input.nextInt();
                    startT = System.currentTimeMillis();
                    time = System.nanoTime();
                    test.iterativeLinearSearch(searchKey); //calling iterative linear search
                    endT = System.currentTimeMillis();
                    endN = System.nanoTime();
                    System.out.println("Time taken in nanoseconds: " + (endN - time));
                    System.out.printf("Time taken in milliseconds: %d%n" , (endT - startT));
                    test.iterativeBinarySearch(searchKey); //calling iterative binary search
                    endT = System.currentTimeMillis();
                    endN = System.nanoTime();
                    System.out.println("Time taken in nanoseconds: " + (endN - time));
                    System.out.printf("Time taken in milliseconds: %d%n" , (endT - startT));
                    break;
                case 4:
                    System.out.println("exiting.."); //if 4 selected program will end
                    System.exit(0);
                    break;
                default:  //default casse for any other than 1 to 4 entered
                	System.out.println("Please choose option 1 to 4");
                	break; }
            
           }catch (InputMismatchException e1) { //catch bloc for bad inputs
				System.out.println("***Input Mismatch Exception***");
				input.next();}

                 	
            }while(true);
    } 
}
