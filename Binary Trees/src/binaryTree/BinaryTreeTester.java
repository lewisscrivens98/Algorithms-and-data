package binaryTree;

/**
* This class is used to show examples of how the sorting methods work and helps
* test the methods to ensure they are working as intended.
* 
* @author Lewis Scrivens
* @version December 2017
*/


public class BinaryTreeTester
{
	public static void main(String[] args) 
	{
		// The current example binary tree.
		BinaryTree tree = new BinaryTree();
		// To control the binary tree sort methods.
		BinaryTreeSortMethods sort = new BinaryTreeSortMethods();
		
		// true makes a binary tree of integers else strings.
		boolean integers = true;
		
		// 0 for inOrder, 1 for preOrder and 2 or anything else for postOrder
		int sortMethod = 1;
		
		// Adding nodes to the binary tree.
		if (integers)
		{
			tree.insert(new Integer(40));
			tree.insert(new Integer(23));
			tree.insert(new Integer(34));
			tree.insert(new Integer(1));
			tree.insert(new Integer(22));
		}
		else
		{
			tree.insert("This");
			tree.insert("Message");
			tree.insert("Will");
			tree.insert("Be");
			tree.insert("Stored");
			tree.insert("In");
			tree.insert("A");
			tree.insert("Binary");
			tree.insert("Tree");
		}
		
		switch(sortMethod)
		{
		case 0:
			// Running an in order sort on the binary tree 'tree'.
			sort.inOrder(tree);
			break;
		case 1:
			// Running an pre order sort on the binary tree 'tree'.
			sort.preOrder(tree);
			break;
		case 2:
			// Running an post order sort on the binary tree 'tree'.
			sort.postOrder(tree);
			break;
		}
	}
}
