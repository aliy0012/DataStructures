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

public class SortingAlgorithms extends BinaryLinearSearch {
	
	public SortingAlgorithms() {
		
	}
	
	/*
	 * bubble sort algorithm
	 */
	public static void bubbleSort() {
		System.out.println("Bubble Sort: Simple sorting algorithm  - O(n2) Complexity");
		int t = 0;
		for(int i = 0; i < numbers.length; i++) {
			for(int z = 1; z < (numbers.length - i); z++) {
				if(numbers[z - 1] > numbers[z]) {
					t = numbers[z - 1];
					numbers[z-1] = numbers[z];
					numbers[z] = t;
				}
			}
		}
		output();
		
	}
	/*
	 * insertion Sort algorithm
	 */
	public static void insertionSort() {
		System.out.println("Insertion Sort: Simple sorting algorithm  - O(n2) Complexity");
		for(int i = 1; i < numbers.length; i++) {
			int k = numbers[i];
			int z = i - 1;
			while((z > -1) && (numbers[z] > k)) {
				numbers[z + 1] = numbers [z];
				z--;
			}
			numbers[z + 1] = k;
		}
		output();
	}
	
	/*
	 * selection sort algorithm
	 */
	public static void selectionSort() {
		System.out.println("Selection Sort: Simple sorting algorithm  - O(n2) Complexity");
		int index;
		for(int i = 0; i < numbers.length - 1; i++) {
			index = i;
			for(int j = i + 1; j <numbers.length; j++) {
				if(numbers[j] < numbers[index]) {
				index = j;
			}
		}
		int smallNumber = numbers[index];
		numbers[index] = numbers[i];
		numbers[i] = smallNumber;
		}
		output();
	}

	  /*
	   * merge sort algorithm  
	   */
	public static void mergeSort(int[] numbers) { 
        
        if(numbers == null) { 
            return; 
        } 
          if(numbers.length > 1) { 
            int mid = numbers.length / 2; //find mid of the array
   
            // left half of the array 
            int[] left = new int[mid]; 
            for(int i = 0; i < mid; i++) { 
                left[i] = numbers[i]; 
            } 
            // right half of the array 
            int[] right = new int[numbers.length - mid]; 
            for(int i = mid; i < numbers.length; i++) { 
                right[i - mid] = numbers[i]; 
            } 
            mergeSort(left);   //call merge_Sort routine for left half of the array 
            mergeSort(right);   // call merge_Sort routine for right half of the array
   
            int i = 0; 
            int j = 0; 
            int k = 0; 
              // now merge two arrays
            while(i < left.length && j < right.length) { 
                if(left[i] < right[j]) { 
                    numbers[k] = left[i]; 
                    i++; 
                } 
                else { 
                    numbers[k] = right[j]; 
                    j++; 
                } 
                k++; 
            } 
          
   // remaining elements 
            while(i < left.length) { 
                numbers[k] = left[i]; 
                i++; 
                k++; 
            } 
            while(j < right.length) { 
                numbers[k] = right[j]; 
                j++; 
                k++; 
            } 
        } 
    }
	
	/*
	 * sap method for quick sort
	 */
	static void swap(int[] arr, int i, int j)
	{
	    int temp = arr[i];
	    arr[i] = arr[j];
	    arr[j] = temp;
	}
	 
	/*
	 * partition method for quick sort
	 */
	static int partition(int[] arr, int low, int high)
	{
	     
	    int pivot = arr[high];
	    int i = (low - 1);
	 
	    for(int j = low; j <= high - 1; j++)
	    {
	         
	        if (arr[j] < pivot)
	        {
	            
	            i++;
	            swap(arr, i, j);
	        }
	    }
	    swap(arr, i + 1, high);
	    return (i + 1);
	}
	 
	/*
	 * recursive quick sort
	 */
	static void quickSort(int[] arr, int low, int high)
	{
	    if (low < high)
	    {
	         
	        int pi = partition(arr, low, high);
	        quickSort(arr, low, pi - 1);
	        quickSort(arr, pi + 1, high);
	    }
	    
	}
	
	/*
	 * printing out sorted elements of array
	 */
	public static void output() {
    	
    	for(int i = 0; i < 21; i++) {
    		
    	if(i == 0) {
        	System.out.print("[" +numbers[i] + ", ");
        	continue;
        }
        if(i == 20) {
        	System.out.print(numbers[i] + "...]");
        	break;
        }
        System.out.print(numbers[i] + ", ");
    }
    }

}
