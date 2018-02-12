package binaryTree;

import java.util.List;

/**
* This class contains the sorting methods for any BTree starting from the given node.
* The methods in this class are recursive and will print the whole binary tree from
* the given node.
* 
* @author Lewis Scrivens
* @version December 2017
*/


public class BinaryTreeSortMethods <T extends Comparable<? super T>> 
{
	public void inOrder(BTree<T> node)
	{
		// If the node is not null then sort.
		if (node != null)
		{
			// If the left of node is empty then do not run a traversal on it.
			if (!node.left().isEmpty())
			{
				inOrder(node.left());
			}
			
			// Print the node when smallest value is reached.
			System.out.println(node.value());
			
			// If the right of node is empty then do not run a traversal on it.
			if (!node.right().isEmpty())
			{
				inOrder(node.right());
			}
		}
	}
	
	public void postOrder(BTree<T> node)
	{
		if (node != null)
		{	
			if (!node.left().isEmpty())
			{
				postOrder(node.left());
			}
			
			if (!node.right().isEmpty())
			{
				postOrder(node.right());
			}

			System.out.println(node.value());
		}
	}

	public void preOrder(BTree<T> node)
	{
		if (node != null)
		{
			// Print the node first before moving on to the children.
			System.out.println(node.value());
			
			if (!node.left().isEmpty())
			{
				preOrder(node.left());
			}
			
			if (!node.right().isEmpty())
			{
				preOrder(node.right());
			}
		}
	}
}
