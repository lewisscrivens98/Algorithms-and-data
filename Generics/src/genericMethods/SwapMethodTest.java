package genericMethods;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwapMethodTest 
{	
	@Test
	public void testSwap() 
	{
		SwapMethod swap = new SwapMethod();
		String[] array = {"Lewis", "Tom", "Ryan", "Niamh", "Luke"};
		
		// a and b represent the indexes that will be swapped in the array.
		int a = 1;
		int b = 4;
		
		swap.Swap(array, a, b);
		
		assertEquals(array[a], "Luke");
		assertEquals(array[b], "Tom");
	}
}
