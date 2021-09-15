import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lab3
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

public class TestSearchSort {

    public static void main(String[] args ) throws ArrayIndexOutOfBoundsException{
    	/*
    	 * variables for class, and calling scanner
    	 */
        int selection;
        int first = 0;
        int last = 29;
        int size = 1000;
        Scanner input = new Scanner(System.in);//.useDelimiter("\\n"); 
        BinaryLinearSearch test = new BinaryLinearSearch(); //creating new object from the class

        do{ //do while loop for looping the menu, till the Exit selected
            System.out.print("\nSelect yout option in the menu below:\n"
                    + "1. Initialize and populate an array of 1000 random integers.\n"
                    + "2. Perform a recursive binary and linear search.\n"
                    + "3. Perform iterative binary and linear seaarch\n"
                    + "4. Sort the array\n"
                    + "5. Exit\n");
            
            try {  //try catch method to catch the input mismatch
            selection = input.nextInt();
            

            switch (selection){  //switch statement for entered menu selection
                case 1:
                    System.out.println("Array of randomly generated integers:"); //f 1 selected array is initialized
                    test.generateRandomInts(); //array elements filled by generate random method
                    BinaryLinearSearch.output();
                    break;
                case 2:
                    System.out.print("Please enter an integer value to search: ");
                    int searchkey = input.nextInt();
                    timingOn();
                    
                    test.recursiveBinarySearch(first, last, searchkey); //calling recursive binary method
                    timingOff();
                    
                    test.recursiveLinearSearch(size, searchkey); //calling recursive linear method
                    timingOff();
                    
                    break;
                case 3:
                    System.out.print("\nPlease enter an integer value to search: ");
                    int searchKey = input.nextInt();
                    timingOn();
                                      
                    test.iterativeBinarySearch(searchKey); //calling iterative binary search
                    timingOff();
                    
                    test.iterativeLinearSearch(searchKey); //calling iterative linear search
                    timingOff();
                    break;
                case 4:
                	while(true) {
                		System.out.println("\nSelect a sorting algorithm to sort the data array"
                				+ "\n\t\tB. Bubble Sort"
                				+ "\n\t\tI. Insertion Sort"
                				+ "\n\t\tS. Selection Sort"
                				+ "\n\t\tM. Merge Sort"
                				+ "\n\t\tQ. Quick Sort"
                				+ "\n\t\tR. Return to Main Menu");
                		String menu = input.next();
                		//menu 4 sorting selections
                		if(menu.equalsIgnoreCase("b")) { //bubble Sort applied
                			timingOn();
                			SortingAlgorithms.bubbleSort();
                			timingOff();
                			
                		}else if(menu.equalsIgnoreCase("I")) { //insertion sort applied
                			timingOn();
                			SortingAlgorithms.insertionSort();
                			timingOff();
                		}else if(menu.equalsIgnoreCase("s")) { //selection sort applied
                			timingOn();
                			SortingAlgorithms.selectionSort();
                			timingOff();
                			
                		}else if(menu.equalsIgnoreCase("m")) { //merge sort applied
                			timingOn();
                			SortingAlgorithms.mergeSort(BinaryLinearSearch.numbers);
                			System.out.println("Merge Sort: Recursive Divide-And-Conquer - O(n log n) Complexity");
                			SortingAlgorithms.output();
                			timingOff();
                			
                		}else if(menu.equalsIgnoreCase("q")) { //quick sort applied
                			timingOn();
                			SortingAlgorithms.quickSort(BinaryLinearSearch.numbers, 0, 999);
                			System.out.println("Quick Sort: Recursive Divide-And-Conquer - O(n log n) Complexity");
                			SortingAlgorithms.output();
                			timingOff();
                			
                		}else if(menu.equalsIgnoreCase("R")) { //if R is selected will return to main menu
                			break;
                			
                		}else {
                			System.out.println("Please choose from menu");
                		}
                	}
                	break;
                case 5:
                    System.out.println("exiting.."); //if 4 selected program will end
                    input.close(); //closing scanner
                    System.exit(0);
                    break;
                default:  //default casse for any other than 1 to 4 entered
                	System.out.println("Please choose option 1 to 5");
                	break; }
            
           }catch (InputMismatchException e1) { //catch bloc for bad inputs
				System.out.println("***Input Mismatch Exception***");
				input.next();}

                 	
            }while(true);
        
    } 
  
    static long startT;
    static long time;
    long endT;
    long endN;
    public static void timingOn() {
    	startT = System.currentTimeMillis();  //staring currenttimemilis and nanotime method
        time = System.nanoTime();
    }
    public static void timingOff() {
    	long endT = System.currentTimeMillis();
        long endN = System.nanoTime();
        System.out.println("\nTime taken in nanoseconds: " + (endN - time));
        System.out.printf("Time taken in milliseconds: %d%n" , (endT - startT));
    }
}
