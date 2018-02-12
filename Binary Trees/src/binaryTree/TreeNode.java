package binaryTree;

public class TreeNode<T extends Comparable<? super T>> 
{
	T value;
	BTree<T> left, right;
	
	public TreeNode(T value) 
	{
		this.value = value;
		
		// When a new node is created created initialise the left and right children.
		left = new BinaryTree<T>();
		right = new BinaryTree<T>();
	}
	
	// Return the value of the node.
	public T value() 
	{
		return value;
	}
	
	// Return the left binary tree of the node.
	public BTree<T> left() 
	{
		return left;
	}
	
	// Return the right binary tree of the node.
	public BTree<T> right() 
	{
		return right;
	}
}
