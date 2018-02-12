package binaryTree;

public class BinaryTree<T extends Comparable<? super T>> implements BTree<T> 
{
	TreeNode<T> root = null;
	
	// Method to return if the root is empty or not.
	@Override
	public boolean isEmpty()
	{
		// if the root is not empty then return false.
		if (root != null)
		{
			return false;
		}
		// Otherwise return true.
		else
		{
			return true;
		}
	}
	
	// Insert method to add nodes to a binary tree.
	@Override
	public void insert(T value) 
	{
		// If the root is empty then initialise it with the given value.
		if (isEmpty())
		{
			root = new TreeNode<T>(value);
		}
		else
		{
			// If the value compared to the roots value is less than 0 then insert the value into left child of the root.
			if (value.compareTo(value()) < 0)
			{
				root.left.insert(value);
			}
			// Otherwise insert it into the right child of the root.
			else
			{
				root.right.insert(value);
			}
		}	
	}

	// Returns the roots current value.
	@Override
	public T value() 
	{
		return root.value();
	}

	// Returns the left child binary tree of the root.
	@Override
	public BTree<T> left() 
	{
		return root.left();
	}

	// Returns the right child binary tree of the root.
	@Override
	public BTree<T> right() 
	{
		return root.right();
	}
}
