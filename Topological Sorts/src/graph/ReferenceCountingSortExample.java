package graph;

/**
* An example class made to represent the lecture notes graph sort
* using the reference counting sort.
* 
* @author Lewis Scrivens
* @version January 2018
*/

public class ReferenceCountingSortExample 
{	
	public static void main(String[] args) throws GraphError
	{
		// Initialising a reference counting sort.
		ReferenceCountingSort<Integer> graph = new ReferenceCountingSort<Integer>();
		
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
		
		// Prints the graph topology as a reference counting sort.
		System.out.println(graph.getSort());
	}
}
