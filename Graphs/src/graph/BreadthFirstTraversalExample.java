package graph;

/**
* An example that will run the main code, in this case it will be to add 
* nodes to the graph extended in the DepthFirstTraversal object and use the 
* traversal method to do a depth first traversal and return a list that is then
* printed.
* 
* @author Lewis Scrivens
* @version January 2018
*/

public class BreadthFirstTraversalExample 
{
	public static void main(String[] args) throws GraphError 
	{
		BreadthFirstTraversal<Integer> graph = new BreadthFirstTraversal<Integer>();
		
		// Add the nodes from the lecture graph to this graph.
		graph.add(0);
		graph.add(1);
		graph.add(2);
		graph.add(3);
		graph.add(4);
		graph.add(5);
		
		// Connect the graph together the same way as the lecture graph.
		graph.add(0, 1);
		graph.add(0, 3);
		graph.add(1, 2);
		graph.add(2, 4);
		graph.add(2, 5);
		graph.add(4, 5);
		
		// Print the bredth first traversal.
		System.out.print(graph.traverse());
	}
}
