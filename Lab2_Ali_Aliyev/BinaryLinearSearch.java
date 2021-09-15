import java.security.SecureRandom;
import java.util.Arrays;
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

/*
 * Binary Linear Search class
 */
public class BinaryLinearSearch {
	/*
	 * class instance variables
	 */
    private Integer[] numbers;
    private int searchKey;
    private int first;
    private int last;
    private int size;

/*
 * class constructor
 */
    public BinaryLinearSearch() {
        size = 30;  //assigning size to 30
        first = 0;  //first index of array
        last = 29;   //last index of array
        numbers = new Integer[size];  //creating new int array with the given size
    }
    /*
     * Iterative Binary Search method
     */
    public int iterativeBinarySearch(int searchKey) {
    	
        int start = 0;
        int end = numbers.length - 1;
        Arrays.sort(numbers);  //sorting array

        while (start <= end) {  //while loop for itertive binary search
        	
            int middle = (start + end) / 2;
            /*
             * assigining middle for iterative binary search
             */
            if (searchKey < numbers[middle]) {
                end = middle - 1;
                continue;
            }

            else if (searchKey > numbers[middle]) {  //if entered number is bigger than array's middle index, then adding 1 to middle
                start = middle + 1;
                continue;
            }

            else if (searchKey == numbers[middle]) {  //if the entered number matches, output
            	remainingElements(start,end);
                System.out.println("Number " + searchKey + " found at index " + middle + ": Iterative Binary Search");
                return numbers[middle];

            } else {
            	remainingElements(start,end);  //if entered number is not found, output
                System.out.println("Number " + searchKey + " was not found: Iterative Binary Search");
                return -1;
            }
        }
        return 1;
    }
    /*
     * recursive binary search method, which calls itself inside of method
     */
    public int recursiveBinarySearch(int first, int last, int searchkey) {
   	 
        Arrays.sort(numbers); //sorting array entries
        
        if (first > last) {  //if first element is bigger than last element, entered number not found output
        	System.out.println(Arrays.toString(numbers));
        	remainingElements(first, last);  //showing remaining entries method
            System.out.println("Number " + searchkey + " was not found: Recursive binary Search");
            return -1;
        }
        if (searchkey == numbers[first]) {  //if entered number and array element is found at first element, output
        	System.out.println(Arrays.toString(numbers));
        	remainingElements(first, last);
            System.out.println("Number " + searchkey + " found at index " + first + ": Recursive binary Search");
            return first;
        } else if (searchkey == numbers[last]) { //if enetered number is found at last inde, output
        	System.out.println(Arrays.toString(numbers));
        	remainingElements(first, last);
            System.out.println("Number " + searchkey + " found at index " + last + ": Recursive binary Search");
            return last;
        } else {
            return recursiveBinarySearch(first + 1, last, searchkey); //if the eneterd number not found above cases, will call method itself by adding 1 to first index
        }
    }
    /*
     * generating random numbers method
     */
    public void generateRandomInts() throws ArrayIndexOutOfBoundsException {
        SecureRandom z = new SecureRandom(); //calling Secure Random method
        for (int i = 0; i < numbers.length; i++) { //for loop for assigning given random secure numbers to each element of array
            numbers[i] = 10 + z.nextInt(90); //setting secure random integer boundaries from 10 to 100
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers)); //printing array elemets as string
        
    }
    /*
     * remaining elements method
     */
    public void remainingElements(int left, int right) {
        for(int i = left; i <= right; i++) {  //for loop to find remaining elements after binary searches
            System.out.print(numbers[i]+ " ");   } 
    	System.out.println(); }

    	/*
    	 * iterative linear search method
    	 */
        public int iterativeLinearSearch(int searchKey){
     	    	
        for (int i = 0; i < numbers.length; i++){ //for loop to search for entered number one by one from indexes of array
            if (numbers[i] == searchKey) {
            	System.out.println(Arrays.toString(numbers));
                System.out.println("Number " + searchKey + " found at index " + i + ": Iterative Linear Search");
                return i;
            }
        }	
        System.out.println(Arrays.toString(numbers));
        System.out.println("Number " + searchKey + " was not found: Iterative Linear Search"); //if not found output
        return -1;
        }

        /*
         * recursive linear search
         */
        public int recursiveLinearSearch ( int size, int searchkey){

            if (searchkey > numbers[size-1]) { //using if else statement to find entered number
                System.out.println("Number " + searchkey + " was not found: Recursive Linear Search");
                return -1;
            }
            if (searchkey == numbers[size-1]) {
                System.out.println("Number " + searchkey + " found at index " + size + ": Recursive Linear Search");
                return size-1;
            }
            else { //if not found decrementing size by one and call method again
            	return recursiveLinearSearch((size - 1), searchkey);
            }
            
        }
    }

