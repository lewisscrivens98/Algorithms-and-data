package graph;

import java.util.ArrayList;
import java.util.List;

/**
* An extension of AdjacencyGraph and implementation of TopologicalSort to
* create a reference counting topological sort on an adjacency graph.
* 
* This sort will go to the nodes with 0 references in order.
* 
* @author Lewis Scrivens
* @version January 2018
*/

public class ReferenceCountingSort<T> extends AdjacencyGraph<T> implements TopologicalSort<T> 
{
	private List<T> sort = new ArrayList<T>();
	
	/**
	 * Perform a reference counting sort on the graph. While there are nodes in the graph,
	 * find the first node that has 0 references and visit that node then break the for loop.
	 * 
	 * @throws GraphError.
	 */
	@Override
	public List<T> getSort() throws GraphError 
	{	
		// If the graph is empty then a sort cannot be done.
		if (getNoOfNodes() <= 0) 
		{
			throw new GraphError("The graph is empty, no nodes found to sort.");
		}
		
		// While there are nodes in the graph.
		while (getNoOfNodes() > 0)
		{
			// For each node in the graph.
			for (T n: getNodes())
			{
				// If the reference count of that node is 0.
				if (getReferenceCount(n) == 0)
				{
					// Visit the node n.
					visitNode(n);
					
					// If a node is visited restart the for loop.
					break;
				}
			}
		}
		
		// Return the sorted list.
		return sort;
	}
	
	/**
	 * Visit the given node by adding it to the sort then removing it from the graph.
	 * 
	 * @throws GraphError.
	 */
	public void visitNode(T node) throws GraphError
	{
		if (sort.contains(node)) return;  // if the node has been visited do not continue and return.
		
		sort.add(node); // Add the node to the sorted list.
		
		this.remove(node); // Remove the visited node from the graph.
	}
}
