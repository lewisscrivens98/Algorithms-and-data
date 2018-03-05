package graph;

import java.util.ArrayList;
import java.util.List;

/**
* An implementation of the depth first traversal on a graph, in this case the
* class extends the adjacency graph and implement the traversal methods.
* 
* @author Lewis Scrivens
* @version January 2018
*/

public class DepthFirstTraversal<T> extends AdjacencyGraph<T> implements Traversal<T>
{
	private List<T> traversal = new ArrayList<T>();

	/**
	 * Perform a depth first traversal of the adjacency graph and 
	 * return the traversal as a list.
	 * 
	 * @return a depth first traversal list of the graph
	 */
	@Override
	public List<T> traverse() throws GraphError 
	{
		// Get the started node for the traversal.
		T nextNode = getNextNode();
		
		if (nextNode == null)
		{
			throw new GraphError("The graph is empty, no nodes found to traverse.");
		}
		
		// While the node is not null visit the node then get the next node.
		while(nextNode != null)
		{
			visitNode(nextNode);
			nextNode = getNextNode();
		}
		
		// Once the traverse is complete return the traversal list.
		return traversal;
	}

	/**
	 * Check and return a boolean for if the traversal contains
	 * the node inputed.
	 * 
	 * @return a boolean on if the traversal contains the given node.
	 */
	private boolean visited(T node) 
	{
		// If the traversal contains the node return true else false.
		return traversal.contains(node);
	}
	
	/**
	 * Loops on the nodes in the graph until it a node is not
	 * contained in the traversal (hasn't been visited) then returns
	 * that node, otherwise null is returned.
	 * 
	 * @return a node that has not yet been visited else null.
	 */
	private T getNextNode() 
	{
		// For each node in the graph.
		for(T node: getNodes())
		{
			// If the traversal doesn't contain the node.
			if(!traversal.contains(node))
			{
				// Return the node.
				return node;
			}
		}
		
		// Return null if there are no unvisited nodes.
		return null;
	}
	
	/**
	 * Given node is added to the traversal then the method 
	 * is ran for each of the nodes neighbours.
	 */
	public void visitNode(T node) throws GraphError
	{
		// If the node is in the traversal list then 
		if(traversal.contains(node))
		{
			// exit method as it has been visited already.
			return;
		}
		
		// Add the node to the traversal list as its being visited.
		traversal.add(node);
		
		// For each neighbour node of "node".
		for(T neighbour: getNeighbours(node))
		{
			// If it has not been visited.
			if(!visited(neighbour))
			{
				// Visit the neighbour node.
				visitNode(neighbour);
			}
		}		
	}
}
