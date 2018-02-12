package arraySorter;

import static org.junit.Assert.*;
import org.junit.Test;
import RandomArray.RandomIntegerArray;

public class QuickSortTest 
{
	@Test // Array with 100 elements
	public void testQuickSort100() 
	{
		QuickSort sorter = new QuickSort();
		RandomIntegerArray randomIntArray = new RandomIntegerArray(100);
		Integer[] array = randomIntArray.randomArray(100);
		
		sorter.sort(array);
		assert(sorter.isSorted(array));
	}
	
	@Test // Array with 1000 elements
	public void testQuickSort1000() 
	{
		QuickSort sorter = new QuickSort();
		RandomIntegerArray randomArray = new RandomIntegerArray(1000);
		Integer[] array = randomArray.randomArray(1000);
		
		sorter.sort(array);
		assert(sorter.isSorted(array));
	}
	
	@Test // Array with 10,000 elements
	public void testQuickSort10000() 
	{
		QuickSort sorter = new QuickSort();
		RandomIntegerArray randomArray = new RandomIntegerArray(10000);
		Integer[] array = randomArray.randomArray(10000);
		
		sorter.sort(array);
		assert(sorter.isSorted(array));
	}
	
	@Test // Array with 100,000 elements
	public void testQuickSort100000() 
	{
		QuickSort sorter = new QuickSort();
		RandomIntegerArray randomArray = new RandomIntegerArray(100000);
		Integer[] array = randomArray.randomArray(100000);
		
		sorter.sort(array);
		assert(sorter.isSorted(array));
	}
}