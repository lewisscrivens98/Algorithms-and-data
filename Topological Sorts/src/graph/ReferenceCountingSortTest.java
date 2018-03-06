package graph;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
* A JUnit test case for the class ReferenceCountingSort. This is used to ensure
* all the methods work as intended.
* 
* @author Lewis Scrivens
* @version January 2018
*/

public class ReferenceCountingSortTest
{
	ReferenceCountingSort<Integer> graph;
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	/**
	 * 	This graph is filled with values and the connections are made 
	 *  so that it is identical to the graph in the lecture notes for 
	 *  a reference counting sort.
	 * 
	 * @throws GraphError.
	 */
	@Before
	// Construct graph from lecture notes to test reference counting sort.
	public void buildGraph() throws GraphError
	{
		graph = new ReferenceCountingSort<Integer>();
		
		// Adding nodes to the graph.
		graph.add(0);
		graph.add(1);
		graph.add(2);
		graph.add(3);
		graph.add(4);
		graph.add(5);
		graph.add(6);
		graph.add(7);
		graph.add(8);
		graph.add(9);
		
		// Adding connections between the nodes to complete the graph.
		graph.add(0, 1);
		graph.add(0, 5);
		graph.add(1, 7);
		graph.add(3, 2);
		graph.add(3, 4);
		graph.add(3, 8);
		graph.add(6, 0);
		graph.add(6, 1);
		graph.add(6, 2);
		graph.add(8, 4);
		graph.add(8, 7);
		graph.add(9, 4);
	}
	
	/**
	 * 	Tests the class by checking the outcome of the reference counting sort
	 *  on graph. It should output "3 6 0 1 2 5 8 7 9 4".
	 * 
	 * @throws GraphError.
	 */
	@Test
	public void testSort() throws GraphError
	{
		// Get the reference counting sort from graph.
		List<Integer> actual = graph.getSort();

		// The expected sort from the lecture notes used to compare to 
		// the actual sort.
		List<Integer> expected = Arrays.asList(3, 6, 0, 1, 2, 5, 8, 7, 9, 4);
		
		// The sort should match the expected list as they are both
		// intended to be reference counting sorts of the constructed graph.
		assertEquals(expected, actual);
	}
	
	/**
	 * 	Test method on adding the same node twice as it should throw a 
	 *  graph error.
	 * 
	 * @throws GraphError with the message for adding two of the same nodes.
	 */
	@Test
	public void testAddingSameNodeTwice() throws GraphError
	{
		Integer node = 0;
		
		// Expected graph error message.
		exception.expectMessage("Cannot add " + node + " to the graph.  This node is "
				+ "already in the graph already contains " + node);
		
		// Add repeated node to the graph.
		graph.add(0);
	}

	/**
	 * 	Test method to sort an empty graph as it should throw a graph error
	 *  stating that the graph is empty.
	 * 
	 * @throws GraphError message for an empty graph sort.
	 */
	@Test
	public void testSortEmpty() throws GraphError
	{
		// Create an empty graph.
		ReferenceCountingSort<Integer> emptyGraph = new ReferenceCountingSort<Integer>();

		// Expect the following graph error.
		exception.expectMessage("The graph is empty, no nodes found to sort.");
		
		emptyGraph.getSort();
	}
	
	/**
	 * 	Test method to check that the reference counting sort is giving 
	 *  the correct number of references for the node 4.
	 * 
	 * @throws GraphError.
	 */
	@Test
	public void testReferenceCounter4() throws GraphError
	{
		// Get the actual reference count for node 4.
		Integer actual = graph.getReferenceCount(4);
		
		// The node 4 is expected to have 3 references.
		Integer expected = 3;
		
		// The expected and actual values should be identical if the code works.
		assertEquals(expected, actual);
	}
	
	/**
	 * 	Test method to check that the reference counting sort is giving 
	 *  the correct number of references for the node 9.
	 * 
	 * @throws GraphError.
	 */
	@Test
	public void testReferenceCounter9() throws GraphError
	{
		// Get the actual reference count for node 9.
		Integer actual = graph.getReferenceCount(9);
		
		// The node 9 is expected to have 0 references.
		Integer expected = 0;
		
		// The expected and actual values should be identical if the code works.
		assertEquals(expected, actual);
	}
}
