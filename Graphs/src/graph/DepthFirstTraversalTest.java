package graph;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

/**
* A JUnit test case that tests if the depth first traversal class works
* as intended to. Specifically the traversal method and some GraphErrors.
* 
* @author Lewis Scrivens
* @version January 2018
*/

public class DepthFirstTraversalTest<T> 
{
	DepthFirstTraversal<Integer> graph;
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	/**
	 * 	This graph is filled with values and the connections are made 
	 *  so that it is identical to the graph in the lecture notes for 
	 *  a depth first traversal.
	 * 
	 * @throws GraphError if the same node is added twice to the graph.
	 */
	@Before
	public void buildGraph() throws GraphError
	{
		graph = new DepthFirstTraversal<Integer>();
		
		graph.add(0);
		graph.add(1);
		graph.add(2);
		graph.add(3);
		graph.add(4);
		graph.add(5);
		
		graph.add(0, 1);
		graph.add(0, 3);
		graph.add(1, 2);
		graph.add(2, 4);
		graph.add(2, 5);
		graph.add(4, 5);
	}
	
	/**
	 * 	Tests the class by checking the outcome of the depth first
	 *  traversal on graph. It should output. "0 1 2 4 5 3".
	 * 
	 * @throws GraphError.
	 */
	@Test
	public void testTraversal() throws GraphError 
	{	
		List<Integer> traversal = graph.traverse();
		
		// The traversal outcome should be this as seen from the lecture notes.
		List<Integer> outcome = Arrays.asList(0, 1, 2, 4, 5, 3);
		
		assertEquals(traversal, outcome);
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
	 * 	Test method to traverse an empty graph as it should throw a graph error
	 *  stating that the graph is empty.
	 * 
	 * @throws GraphError message for an empty graph traversal.
	 */
	@Test
	public void testTraversalEmptyGraph() throws GraphError
	{
		DepthFirstTraversal<Integer> emptyGraph = new DepthFirstTraversal<Integer>();
		
		// Expect the following graph error.
		exception.expectMessage("The graph is empty, no nodes found to traverse.");
		
		// Run traversal method on empty graph.
		emptyGraph.traverse();
	}	
}
