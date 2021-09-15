public class Numbers {

	private static Float [] numbers; //Stores Float values
	int i = 0;
	private int numItems; //Store the number of items currently in the array.

	public Numbers() {
		/*
		 * default constructor
		 */
		this.numItems = numItems;
	}
	

	/*
	overload constructor
	 */
	public Numbers(int size) {

		this.numItems = size;
		this.numbers = new Float[numItems];
	}

	/*
	add value method accepting Scanner object
	 */
	public void addValue(Scanner keyboard) {

		if(numbers!=null) {  //if else statement, for deciding if array is full or not
			if(i<numbers.length){
				System.out.print("Enter value: ");
				numbers[i]=keyboard.nextFloat();
				i++;
			}
			else {
				System.out.println("Array is full");
			}

		}else {
			i = 0;
			System.out.print("Please initialize array first");
		}
	}
	
	/*
	calcAverage method for calculating average in array
	 */
	public float calcAverage() {
		// TODO Write code to return the average of the values in the array
		float sum = 0;
		for(int i = 0; i < numbers.length; i++) {  //for loop for scanning through array elements
			try {
				sum += numbers[i];
			}catch (NullPointerException e5){ //try catch bloc for Null Point exception in array
				break;
			}
		}
		float average = sum/(numbers.length);  //calculating average of array
		return average;
	}
	/*
	to string method for printing array elements
	 */
	public void toStringMethod() throws NullPointerException {

			if (numbers[0] != null) {

					for (int i = 0; i < numbers.length; i++) {  //for loop for getting each element of array
						try {
						System.out.println(numbers[i].toString());
						}catch (NullPointerException e){
							break;
					}
				}
			} else {  //if else statement for stoping when array is empty
				System.out.println("Array is empty");
			}
			}

	/*
	finding minimum and maximum value in array
	 */
	public void findMinMax() {
		if(numbers[0] != null){
		float max = numbers[0];
		float min = numbers[0];
		for(int i = 1; i < numbers.length; i++) {//for loop for finding min and max
			try {
				if (numbers[i] > max) {
					max = numbers[i];
				} else if (numbers[i] < min) {
					min = numbers[i];
				}
			}catch (NullPointerException e4){
				break;
			}
		}	
		System.out.printf("Average is %.1f ", calcAverage());
		System.out.printf(" Minimum value is %.1f ", min);
		System.out.printf(" Maximum value is %.1f %n", max);}
		else {
			System.out.printf("Average is 0.0");
			System.out.printf(" Minimum value is 0.0");
			System.out.printf(" Maximum value is 0.0 %n");
		}
}

	}
