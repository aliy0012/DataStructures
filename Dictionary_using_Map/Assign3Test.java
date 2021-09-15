import java.util.Scanner;
import java.util.TreeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
/** Assignment 3
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

public class Assign3Test {

	/**
	 * main method
	 * @param args
	 * @throws IOException
	 */
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //calling scanner
        Dictionary dictionary = new Dictionary();
        //creating object from dictionary class
        boolean articles = false;
        /*boolena to check for loop*/
        boolean done = false;

        /*
         * while loop for menu options
         */
        while (!done) {
              System.out.print("\n*********************************************************\n"
            		  + "Dictionary\n"
            		  +"*********************************************************\n"
            		  +"1. Add words to the Dictionary from file\n"
            		  +"2. Search a word in the Dictionary\n"
            		  +"3. Display number of unique words in the Dictionary\n"
            		  +"4. Display number of all words in the Dictionary\n"
            		  +"5. Reset Dictionary\n"
            		  +"6. Ignore definite and indefinite articles (" + articles + ")\n"
            		  +"7. Exit"
            		  + "\nEnter your menu:  ");
               

            String menu = null;

            while (!input.hasNextLine()) {
                input.next();
            }

            menu = input.nextLine().toLowerCase();
            //1 is selected read file and add the word
            if (menu.equals("1")) {
                dictionary.addToFile();
                //2is selected search for the entry
            } else if (menu.equals("2")) {
                dictionary.search();
                //3selected show unique words
            } else if (menu.equals("3")) {
                dictionary.uniqueWords();
                //4 is selected show all the words in dictionary
            } else if (menu.equals("4")) {
                dictionary.displayWords();
            } else if (menu.equals("5")) {
            	//5 is selected reseting dictionary
                dictionary.clearDictionary();
            } else if (menu.equals("6")) {
            	//6 is selected seting articles true or false
                dictionary.articles();

            } else if (menu.equals("7")) {
            	//7 is for exiting program
            	//closin scanner
                System.out.println("Program ended");
                input.close();
                System.exit(0);
                done = true;
            }else {
            	/*
            	 * if not entry is not equal to menu selection, throwing error message, and looping back
            	 */
                System.out.println("Select from menu options");
            }

        }
    }


}