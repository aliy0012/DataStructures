public class Assign1 {

	public static void main(String[] args) throws NullPointerException{
		/*
		 * display menu method called to showing menu options
		 */
		displayMenu();
		
	}

	/*
	 * displaymenu method to assign input to Inventory class method
	 */
	public static void displayMenu() {
		int selection;
		Inventory inventory = new Inventory();
		Scanner input = new Scanner(System.in);
		do {
			try {
			System.out.print("Please select one of the following:\n"
					+ "1: Add Item to Inventory\n"
					+ "2: Display Current Inventory\n"
					+ "3: Buy Item(s)\n"
					+ "4: Sell Item(s)\n"
					+ "5: Exit\n"
					+ "> ");
			selection = input.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Enter correct menu selection please");
				input.next();
				continue;
			}
			
			
			switch(selection) {
			case 1: //if 1 is seleced adding item
				inventory.addItem(input);
				break;		
			case 2: //if 2 is slected printing rray elements
				System.out.println(inventory);
				break;
			case 3: //if 3 buying from the inventory
				inventory.updateQuantity(input, true);
				break;
			case 4: //if 4, selling from inventory
				inventory.updateQuantity(input, false);
				break;
			case 5: //if 5 selected ending rogram
				System.out.println("Exiting..");
				System.exit(0);
				break;
			default:
				System.out.println("Enter correct menu option"); //all other cases wrong input output
				break;	
			}
			
		}while(true);
	}
	}


