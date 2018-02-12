package arraySorter;

import static org.junit.Assert.*;
import org.junit.Test;
import RandomArray.RandomIntegerArray;

/**
 * A Test class for the SelectionSort class to ensure all the methods work as intended.
 * 
 * @author Lewis Scrivens
 * @version November 2017
 */

public class SelectionSortTest 
{
	@Test // Array with 100 elements
	public void testSelectionSort100() 
	{
		SelectionSort sorter = new SelectionSort();
		RandomIntegerArray randomIntArray = new RandomIntegerArray(100);
		Integer[] array = randomIntArray.randomArray(100);
		
		sorter.sort(array);
		assert(sorter.isSorted(array));
	}
	
	@Test // Array with 1000 elements
	public void testSelectionSort1000() 
	{
		SelectionSort sorter = new SelectionSort();
		RandomIntegerArray randomArray = new RandomIntegerArray(1000);
		Integer[] array = randomArray.randomArray(1000);
		
		sorter.sort(array);
		assert(sorter.isSorted(array));
	}
	
	@Test // Array with 10,000 elements
	public void testSelectionSort10000() 
	{
		SelectionSort sorter = new SelectionSort();
		RandomIntegerArray randomArray = new RandomIntegerArray(10000);
		Integer[] array = randomArray.randomArray(10000);
		
		sorter.sort(array);
		assert(sorter.isSorted(array));
	}
	
	@Test // Array with 100,000 elements
	public void testSelectionSort100000() 
	{
		SelectionSort sorter = new SelectionSort();
		RandomIntegerArray randomArray = new RandomIntegerArray(100000);
		Integer[] array = randomArray.randomArray(100000);
		
		sorter.sort(array);
		assert(sorter.isSorted(array));
	}
}
