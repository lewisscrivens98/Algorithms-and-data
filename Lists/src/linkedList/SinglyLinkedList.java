package linkedList;

/**
* An implementation of List<T> using singly linked lists.
* 
* @author Lewis Scrivens
* @version November 2017
*/

public class SinglyLinkedList<T> implements List<T> 
{
	
	private Node<T> head = null;
	private Node<T> node = null;
	private int numberOfNodes = 0;

	// If the list is empty (null) then return true otherwise false.
	@Override
	public boolean isEmpty() 
	{
		if (head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public void add(int index, T value) throws ListAccessError 
	{
		if (index == 0 && isEmpty())
		{
			// If index is 0 and the head is empty add the node value at the head (start of the list).
			head = new Node<T>(value);
		}
		else if (isEmpty())
		{
			// If head equals null and index is not 0.
			throw new ListAccessError("Index is out of bounds.");
		}
		else if (index < 0)
		{
			// If index is negative throw ListAccessError.
			throw new ListAccessError("Index is negative.");
		}
		else
		{
			// Set node to head (First in the list).
			node = head;
			
			// Find the node before the node to set to value.
			for(int i = 0; i < index - 1; i++)
			{
				if (node.getNext() == null)
				{
					// If any node in-between the head and given index is null then throw ListAccessError.
					throw new ListAccessError("Index is out of bounds.");
				}
				else
				{
					// Else set node to the next node.
					node = node.getNext();
				}
			}
			// Set the node at index to the value.
			node.setNext(new Node<T>(value));
		}
		
		// Increment the number of nodes after its added.
		numberOfNodes++;
	}

	@Override
	public T remove(int index) throws ListAccessError 
	{
		// Set node to head (First in the list).
		node = head;
		
		if (head == null)
		{
			// If the head file is null the list must be empty.
			throw new ListAccessError("List is Empty.");
		}
		else if (index < 0)
		{
			// If the index is negative throw ListAccessError.
			throw new ListAccessError("Index is negative.");
		}
		else if (isEmpty())
		{
			// If the head file is null the list must be empty.
			throw new ListAccessError("List is Empty.");
		}
		else if (index == 0)
		{
			// If the first node is being removed set the head to the next index.
			head = node.getNext();
		}
		else
		{
			// For loop to get the next node until its in position to remove the index.
			for (int i = 0; i < index - 1; i++)
			{
				node = node.getNext();
			}
			
			// Set the node at the index to the node in-front of it.
			node.setNext(node.getNext().getNext());
		}
		
		// Decrement numberOfNodes by 1 as one has been removed.
		numberOfNodes--;
		// Returns the new value of the node removed.
		return get(index);
	}

	@Override
	public T get(int index) throws ListAccessError 
	{
		// Set node to head (First in the list).
		node = head;
		
		if (index < 0)
		{
			// If the given index is negative throw ListAccessError.
			throw new ListAccessError("Index is negative.");
		}
		else if (isEmpty())
		{
			// If the given index is negative throw ListAccessError.
			throw new ListAccessError("List is Empty.");
		}
		else if (index > numberOfNodes - 1)
		{
			throw new ListAccessError("Index is out of bounds.");
		}
		else
		{
			// For loop will go through each node checking if it is empty.
			for(int i = 0; i < index; i++)
			{
				if (node.getNext() == null)
				{
					// If the node at the given index is empty (null) then throw ListAccessError.
					throw new ListAccessError("Index is out of bounds.");
				}
				else
				{
					// Else get the next node and repeat until node is equal the node at the given index.
					node = node.getNext();
				}
			}
		}
		// Else return the node.
		return node.getValue();
	}	

	// Method used for testing size of the list after removal of nodes.
	public int getNumberOfNodes() throws ListAccessError
	{
		// If the number of nodes is 0 the list must be empty.
		if (numberOfNodes == 0)
		{
			throw new ListAccessError("List is Empty.");
		}
		else
		{
			// Else return the number of nodes.
			return numberOfNodes;	
		}
	}
}
