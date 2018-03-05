package graph;

/**
* An example, in this case it will be to add nodes to the graph extended in the 
* DepthFirstTraversal object and use the traversal method to do a breadth first 
* traversal and return a list that is then printed.
* 
* This code was used to help me get a better understanding of how the BreadthFirstTraversal
* class works.
* 
* @author Lewis Scrivens
* @version January 2018
*/

public class DepthFirstTraversalExample 
{

	/** 
	* Adds elements to the adjacency graph "Graph" and uses the 
	* traverse method to return a depth first traversal on the 
	* adjacency graph "Graph".
	*/
	public static void main(String[] args) throws GraphError
	{
		DepthFirstTraversal<Integer> graph = new DepthFirstTraversal<Integer>();
		
		// Add the nodes from the lecture graph to the graph.
		graph.add(0);
		graph.add(1);
		graph.add(2);
		graph.add(3);
		graph.add(4);
		graph.add(5);
		
		// Connect the graph together to represent the graph from the lecture notes.
		graph.add(0, 1);
		graph.add(0, 3);
		graph.add(1, 2);
		graph.add(2, 4);
		graph.add(2, 5);
		graph.add(4, 5);
		
		// Print the depth first traversal list.
		System.out.print(graph.traverse());
	}
}
