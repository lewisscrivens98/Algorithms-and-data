package arraySorter;

import RandomArray.RandomArray;
import RandomArray.RandomIntegerArray;
import java.util.Arrays;

/**
 * The implementation of selection sort.
 * 
 * @author Lewis Scrivens 
 * @version November 2017
 */

public class SelectionSort<T extends Comparable<? super T>> extends ArraySortTool<T>
{
    public void sort(T[] array) 
    {
    	// Selection is an item in the array which is compared with every item after it using a for loop.
        for (int selection = 0; selection < array.length - 1; selection++)
        {
        	// Smallest known value index is set to selection.
            int smallerValueIndex = selection;
            // Iterate through each index value after selection.
            for (int comparison = selection + 1; comparison < array.length; comparison++)
            {
            	// Check if the comparison is smaller than the current smallerValueIndex.
                if ((int)array[comparison] < (int)array[smallerValueIndex]) 
                {
                	// Set the new smallerValueIndex to the comparison given its smaller.
                	smallerValueIndex = comparison;
                }     
            }
  
            // Temporary copy of smaller number.
            T copy = array[smallerValueIndex];
            // Swap the smallest value with the current selection starting from the beginning of the array.
            array[smallerValueIndex] = array[selection];
            // Finish the swap by setting the new selection element to the copy of the smaller number.
            array[selection] = copy;
        } 	
    }
}