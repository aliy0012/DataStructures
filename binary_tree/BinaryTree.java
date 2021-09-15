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
 * creates the binary tree.
 */
public class BinaryTree {

	BinaryTreeNode root = null;
/**
 * insertInTree method
 * adding data to the tree
 * @param newData
 */
	public void insertInTree (int newData) {
		if (root == null)
			root = new BinaryTreeNode(newData);
		else
			root.insert(newData);
	}

		//can use either  or both of the methods shown below
	/**
	 * dispaying pre order
	 */
	public void displayPreOrder () {
		displayPreOrder(root);
	}
	
	/**
	 * Traverse the tree using PreOrder algorthim and display the content to the console
	 */
	private void displayPreOrder (BinaryTreeNode subRoot){
		if (subRoot == null)
			return;
		System.out.print(subRoot.getData() + " ");
		displayPreOrder(subRoot.getLeft());
		displayPreOrder(subRoot.getRight());
	}
	/**
	 * calculating height of the tree
	 * @param node
	 * @return
	 */
	public int height(BinaryTreeNode node) {
		if (node == null) {
			return 0;
		} else {
			/**
			 *  calculating the height
			 */
			int leftDepth = height(node.getRight());
			/**
			 * left highest
			 */
			int rightDepth = height(node.getLeft());
			
			/**
			 *  comparing left and right 
			 *  then adding  1 to higher side
			 */
			if (leftDepth > rightDepth)
				return (leftDepth + 1);
			else 
				return (rightDepth + 1);
		}
	}
}
