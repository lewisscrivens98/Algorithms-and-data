package arraySorter;

import RandomArray.RandomArray;
import RandomArray.RandomIntegerArray;
import java.util.Arrays;

/**
 * The implementation of quick sort.
 * 
 * @author Lewis Scrivens 
 * @version November 2017
 */

public class QuickSort<T extends Comparable<? super T>> extends ArraySortTool<T>
{    
    public void sort(T[] array)
    {
    	// Run the recursiveSort function on the whole array.
    	recursiveSort(array, 0, array.length - 1);
    }
    
    public void recursiveSort(T[] array, int startIndex, int endIndex)
    {
    	// Partition the array with the lower as the startIndex and the higher as the endIndex.
    	int index = partition(array, startIndex, endIndex);
    	
    	// If the returned index - 1 is bigger than the current startIndex.
    	if (startIndex < index - 1)
    	{
    		// Perform another recursiveSort on the left side.
    		recursiveSort(array, startIndex, index - 1);
    	}
    	
    	// If the returned index is smaller than the current endIndex.
    	if (endIndex > index)
    	{
    		// Perform another recursiveSort on the right side.
    		recursiveSort(array, index, endIndex);
    	}
    }
    
    // Function for diving the array into two parts and comparing values from each half to swap.
    public int partition(T[] array, int left, int right)
    {
    	// Set pivot (element to compare to) to element at the left index.
		int pivot = (int)array[left];
		 
		// Run containing code while left is less than or equal to right.
		while (left <= right) 
		{ 
			// Increment left index by 1 when the element at the left index is smaller than the pivot element.
			while ((int)array[left] < pivot) 
			{
				left++;
			}
			
			// Decrement right index by 1 when the element at the right index is larger than the pivot element.
			while ((int)array[right] > pivot) 
			{
				right--;
			}
 
			// If the left index is smaller or equal to the right index, swap them.
			if (left <= right) 
			{
				
				// Temporary copy of element at the left index.
	            T copy = array[left];
	            // Swap the left index element (smaller element) with the right element.
	            array[left] = array[right];
	            // Finish the swap by setting the element at the right index to the copy of the element at the left index.
	            array[right] = copy;
				
	            //Increment left and decrement right by 1 to continue the partition.
				left++;
				right--;
			}
		}
		
		// Once the function as finished return the left index.
		return left;
    }
}