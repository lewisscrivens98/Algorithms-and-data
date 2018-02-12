package binaryTree;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BinaryTreeTest
{
	@Test
	void testIsEmptyWhenEmpty() 
	{
		BinaryTree tree = new BinaryTree();

		// Expected that the tree is empty as no values have been inserted.
		assertEquals(true, tree.isEmpty());
	}
	
	@Test
	void testIsEmptyWhenNotEmpty() 
	{
		BinaryTree tree = new BinaryTree();
		// Insert something so the root is no longer null.
		tree.insert(" ");
		
		// Expected that the tree is not empty.
		assertEquals(false, tree.isEmpty());
	}
	
	@Test
	void testLeft() 
	{
		BinaryTree tree = new BinaryTree();

		// Insert the following into the BinaryTree tree.
		tree.insert("m");
		tree.insert("b");
		tree.insert("c");
		tree.insert("z");
		
		// Root->Left Node value.
		Comparable leftValue = tree.left().value();
		
		// B should be the left value as its smaller than the root M.
		assertEquals("b", leftValue);
	}
	
	@Test
	void testRight() 
	{
		BinaryTree tree = new BinaryTree();

		// Insert the following into the BinaryTree tree.
		tree.insert("m");
		tree.insert("b");
		tree.insert("c");
		tree.insert("z");
		
		// Root->Right Node value.
		Comparable rightValue = tree.right().value();
		
		// Z should be the left value as its bigger than the root M.
		assertEquals("z", rightValue);
	}
	
	@Test
	void testInsert() 
	{
		BinaryTree tree = new BinaryTree();

		// Insert the following into the Binary Tree tree.
		tree.insert("m");
		tree.insert("b");
		tree.insert("c");
		tree.insert("z");
		
		// Root->Left Node->Right Node value.
		Comparable value = tree.left().right().value();
		
		// I expect c to be in this position from the order I have inserted the values.
		assertEquals("c", value);
	}
	
	@Test
	void testRoot() 
	{
		BinaryTree tree = new BinaryTree();

		// Insert the following to the BinaryTree tree.
		tree.insert("m");
		tree.insert("b");
		
		// Root value.
		Comparable root = tree.value();
		
		// I expect that the roots value is M as it was inserted first when the root was null.
		assertEquals("m", root);
	}
}
