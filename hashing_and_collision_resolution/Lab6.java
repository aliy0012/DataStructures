import java.util.Scanner;
/** Lab 6
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
 * hashmap
 */
/**
 * 
 * @author ali aliyev
 *
 */
public class Lab6
{
	/**
	 * menu method
	 */
	public static void displayMenu() {
		System.out.print("Please select one of the following:\n"
				+ "1. Add a String to the array dataItems\n"
				+ "2. Search for a String in the array\n"
				+ "3. Exit\n"
				+ "> ");
	}

    /**
     * calculating hash code based on instructions
     * @param strin
     * @return
     */
    public static int hashingMethod(String strin)
    {
        int sum = 0;
        for(int i = 0; i < strin.length(); i++)
        {
        	//for loop to loop all the elements
        	if(i == 3) {
        		//if it is 3 element, break the loop
        		break;
        	}
        	//adding up first 2 charachters of the entry
            sum += strin.charAt(i);
        }
        //using modulo operator, calulating the hash code
        return sum % 100;
    }
    
    /**
     * main method for class
     * @param args
     */
    public static void main(String[] args) {       
        Scanner input = new Scanner(System.in);
        String dataItems[] = new String[100];
        
       
        int menu;
        //while loop till the 3 entered
        while(true) {
            displayMenu();
            menu = input.nextInt();
            
            switch(menu)
            {
                case 1:
                	//adding elements to the array
                    {
                        System.out.print("Enter string to insert: ");
                        String entry = input.next();
                        // getting the hash of string
                        int hash = hashingMethod(entry);
                        
                        // checking if position is available
                        while(dataItems[hash]!=null && hash <= 99)
                        {
                            hash ++;
                        }
                        // if position is not available simple show string can't be addded 
                        if(hash == 100)
                            System.out.println("String cannot be added");
                        // else show  the  index at which string is entered
                        else
                        {
                        	//assigning string to the hash code index
                            dataItems[hash] = entry;
                            //printing the table
                            System.out.print("Table: { ");
                            for(int i = 99; i>= 0; i--) {
                            	if(dataItems[i] != null) {
                            		System.out.print(i + "=" + dataItems[i] + ", ");
                            	}
                            	else
                            		continue;
                            	}
                        }
                    }
                    System.out.print("}\n");
                    break;
                    
                    //searching the element in the array
                  case 2:
                      {
                          System.out.print("Enter string to find: ");
                          String entry = input.next();
                          boolean found = false;
                          // check at  each  position if string is present
                          for(int i = 0; i < 100; i++)
                          {
                              if(entry.equals(dataItems[i]))
                              {
                                  System.out.println("\"" + entry + "\"" + " found at index " + i);
                                  //printing the table
                                  System.out.print("Table: { ");
                                  for(i = 99; i>= 0; i--) {
                                  	if(dataItems[i] != null) {
                                  		System.out.print(i + "=" + dataItems[i] + ", ");
                                  	}
                                  	else
                                  		continue;
                                  	}
                                  System.out.print("}\n");
                                  found = true;
                                  break;
                              }
                          }
                          
                         
                          if(!found)
                            System.out.println(entry + " not found");
                      }
                      break;
                      
                case 3:
                	//3 for closing scanner and exiting the program
                    {
                         System.out.print("Exiting.. ");
                         input.close();
                         System.exit(0);
                    break;
                 }     
            
        } 
        } 
}
}
    
