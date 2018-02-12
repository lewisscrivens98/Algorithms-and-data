package genericMethods;

import java.util.Arrays;

public class SwapMethod 
{
	// Method takes a string and two integers which represent the array indices to swap.
	public void Swap(String[] array, int a, int b)
	{
		if (a > array.length - 1 || a < 0 || b > array.length - 1 || b < 0)
		{
			System.out.println("a or b is out of the array's range.");// Error printed to console.
		}
		else if (a == b)
		{
			System.out.println("Cannot swap the same item.");// Error printed to console.
		} 
		else
		{
			String copy;
			
			copy = array[a];// Using the copy string to save the value of index a in array.
			array[a] = array[b];// Setting index a to the value of index b in array.
			array[b] = copy;// Setting index b in array to the copy string which was the original index a in array.
			
			printArray(array);// Print the swapped array.
		}
	}
	
	static void printArray(String[] array)
	{
		System.out.println(Arrays.toString(array));// Print swapped array to console.
	}
	
	public void main(String[] args)// Example for my SwapMethod, swapping elements 0 and 3 in an array.
	{
		
		// Initialising variables
		int a, b;
		String[] names = {"Lewis", "Tom", "Ryan", "Niamh", "Luke"};
		
		a = 0;// Index 1 
		b = 3;// Index 2
		
		Swap(names, a, b);// Method that swaps index a and b in any given array.
	}
}
