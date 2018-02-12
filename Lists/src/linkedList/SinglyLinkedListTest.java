package linkedList;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SinglyLinkedListTest 
{
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testGetSingleton() throws ListAccessError 
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		list.add(2, 5);
		
		// Expected that the node at index 1 equals 3.
		assertEquals(new Integer(3),list.get(1));
	}
	
	@Test
	public void testGetSingletonNegative() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		list.add(2, 5);
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("Index is negative.");

		list.get(-1);
	}
	
	@Test
	public void testGetSingletonOutOfBounds() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		list.add(2, 5);
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("Index is out of bounds.");

		list.get(4);
	}
	
	@Test 
	public void testGetEmtpyList() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("List is Empty.");
		
		// Getting any number in an empty list.
		list.get(3);
	}
	
	@Test
	public void testAddSinglton() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
	}

	@Test
	public void testAddSingltonNegative() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("Index is negative.");
		
		// Added to prevent out of bounds error due to the list not starting at index 0.
		list.add(0, 11);
		list.add(-1, 2);
	}
	
	@Test
	public void testAddSingltonOutOfBounds() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("Index is out of bounds.");
		
		list.add(4, 2);
	}
	
	@Test
	public void testNumberOfNodes() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		list.add(2, 4);
		
		// Expected that the number of nodes will now be 3.
		assertEquals(list.getNumberOfNodes(), 3);
	}
	
	@Test
	public void testNumberOfNodesAfterRemoval() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		list.add(2, 4);
		
		// Remove node from index 0 twice.
		list.remove(0);
		list.remove(0);
		
		// Expected that the number of nodes will now be 1.
		assertEquals(list.getNumberOfNodes(), 1);
	}
	
	@Test
	public void testNumberOfNodesEmpty() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("List is Empty.");
		
		list.getNumberOfNodes();
	}
	
	@Test
	public void testRemoveNode() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		list.add(2, 4);
		list.add(3, 3);
		
		// Expected that the new value at index 2 is 3 after removing the node.
		assertEquals(new Integer(3), list.remove(2));
	}
	
	@Test
	public void testRemoveFirstNode() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		list.add(2, 4);
		list.add(3, 3);
		
		// Expected that the new value at index 0 is 3 after removing the first node.
		assertEquals(new Integer(3), list.remove(0));
	}
	
	@Test
	public void testRemoveLastNode() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("Index is out of bounds.");
		
		// Returned the node at the index removed, as it was the last node it equals null.
		list.remove(1);
	}
	
	@Test
	public void testRemoveNegativeNode() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		list.add(0, 2);
		list.add(1, 3);
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("Index is negative.");
		
		// Returned the node at the index removed, as it was the last node it equals null.
		list.remove(-2);
	}
	
	@Test
	public void testRemoveEmptyNode() throws ListAccessError
	{
		SinglyLinkedList<Integer> list = new SinglyLinkedList<Integer>();
		
		exception.expect(ListAccessError.class);
		exception.expectMessage("List is Empty.");
		
		list.remove(1);
	}
}
