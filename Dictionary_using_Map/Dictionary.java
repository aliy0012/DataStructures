import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
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
/**
 * Dictionary class
 * @author ali aliyev
 *
 */
public class Dictionary {
	private Scanner input = new Scanner(System.in);
	//scanner for the class
	 TreeMap<String, Integer> dictionary = new TreeMap<>();
	 //dictionary map created
	boolean articles = false;
	//article set to false

	/**
	 * reseting dictionary
	 */
	public void clearDictionary() {
		 dictionary.clear();
		 // clear all words
         System.out.println("Program has removed all the words\n");
	}

	/**
	 * reading from text, and adding the word to the dictionary
	 * @throws IOException 
	 */
public void addToFile() throws IOException {
	 System.out.print("Enter the file name to add words to dictionary : ");
	 //reading entry from user
     String word = input.next();
     /*
      * reading from given file
      * path set to "raven.txt
      */
     List<String> lines = Files.readAllLines(Paths.get("Raven.txt"), StandardCharsets.UTF_8);
     // iterate over lines
     lines.forEach(line -> { //each line read from the text
         line = line.toLowerCase();
         // getting words to the array
         String[] words = line.split(" ");
         Arrays.stream(words).forEach(key -> {
             /*put key-value pair into dictionary 
              * if doesn't exists 
              * otherwise incrementing value*/
             dictionary.put(key, dictionary.getOrDefault(key, 0) + 1);
         });
     });
     //adding word to dictionary
     String[] words = word.toLowerCase().split(" ");
		int counter = 0;

		for (String word1 : words) {
			/*
			 * for loop for the word
			 */
			word1 = word1.replaceAll("[^A-Za-z]", "");

			if (word1.equals(""))
				//when word is space, ignore it
				continue;

			Integer value = dictionary.get(word1);

			if (value == null) {
				value = new Integer(1);
			} else {
				value = new Integer (value.intValue() + 1);
			}
			dictionary.put(word1, value);
			counter++;}
     System.out.println("Program has read the file\n");
     //reading the text file and adding word to the dictionary
}

	/**
	 * 
	 * searching for the word method
	 */
	public void search() {
		System.out.print("Enter the word you want to search : ");
        String search = input.next();
        int occurs = 0;
        if (articles) {
            // search word don't belongs to articles
            if (!search.equalsIgnoreCase("a") && !search.equalsIgnoreCase("an")
                    && !search.equalsIgnoreCase("the")) {
                // geting the 
            	//value for search key
                occurs = dictionary.getOrDefault(search, 0);
            }
        } else {
            occurs = dictionary.getOrDefault(search, 0);
            // get value for search key
        }
        System.out.println(search + " occurs " + occurs + " times.\n");
        /*
         * showing how many times the word appeared in search
         */
	}
	/**
	 * uniqueWord method
	 * to shoping words appeared in the search
	 */
	public void uniqueWords() {
	 int words = 0;
     // iterate over map
     for (Map.Entry<String, Integer> temp : dictionary.entrySet()) {
         // check word is unique
         if (temp.getValue() == 1) {
             // definite/indefinite articles 
        	 //are ignored
             if (articles) {
                 // key is not article
                 if (!temp.getKey().equalsIgnoreCase("a") && !temp.getKey().equalsIgnoreCase("an")
                         && !temp.getKey().equalsIgnoreCase("the")) {
                     words++;
                 }
             }
             // definite/indefinite articles are not ignored
             if (!articles) {
                 words++;
                 //incrementing words
             }
         }
     }
     System.out.println("Dictionary has " + words + " unique words\n");
}
	/**
	 * displaying word method
	 * @throws IOException 
	 * --
	 */
	public void displayWords() throws IOException {
		int size = 0;
        // iterate over map
        for (Map.Entry<String, Integer> temp : dictionary.entrySet()) {
            // definite/indefinite articles are not ignored
            if (!articles) {
                size = size + temp.getValue();// add word counter
            }
            // definite/indefinite articles are ignored
            if (articles) {
                // key is not article
                if (!temp.getKey().equalsIgnoreCase("a") && !temp.getKey().equalsIgnoreCase("an")
                        && !temp.getKey().equalsIgnoreCase("the")) {
                    size = size + temp.getValue();// add word counter
                }
            }
        }
        System.out.println("Dictionary has " + size + " words\n");

	}

	


	/**
	 *articles  method
	 *
	 */
	public void articles() {
		articles = true;
        System.out.println("Ignore definite and indefinite articles has been set to " + articles + "\n");
        /*
         * setting articles to true
         */
	}

}