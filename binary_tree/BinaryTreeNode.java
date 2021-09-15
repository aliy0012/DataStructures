/** Lab 5
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
 * creates a single Node of the binary tree.
 */
/**
 * 
 * @author ai
 *
 */
public class BinaryTreeNode {

	/**
	 * class variables declared
	 */
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	/**
	 * Binary Tree Node constructor
	 */
	public BinaryTreeNode() {
		this.left = null; 
		this.right = null; 
		this.data = 0;
	}
	

	/**
	 * Constructor creating object with given data
	 * @param data
	 */
	public BinaryTreeNode(int data) {
		this.left = null; 
		this.right = null; 
		this.data = data;
	}

	/**
	 * grting data from tree
	 * @return
	 */
	public int getData() {
		return data;
	}
	

	/**
	 * getting left from tree
	 * @return
	 */
	public BinaryTreeNode getLeft() {
		return left;
	}


	/**
	 * getting right subtree from tree
	 * @return
	 */
	public BinaryTreeNode getRight() {
		return right;
	}

	/**
	 * adding data to the tree
	 * @param newData
	 */
	public void insert (int newData) {
		if(newData<data){
			if(left == null)
				left = new BinaryTreeNode(newData);
				else
					left.insert(newData);
		}else if(newData>data){
			if (right == null)
				right = new BinaryTreeNode(newData);

			else
				right.insert(newData);
		}else
		/**
		 * if data already in tree
		 */
			System.out.println("Duplicated data " + newData);
		
	}
}
