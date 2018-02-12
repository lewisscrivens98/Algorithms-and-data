package arraySorter;

import RandomArray.*;

/**
 * A timer for the SelectionSort class to time how many milliseconds it 
 * takes for a random array of different sizes.
 * 
 * @author Lewis Scrivens
 * @version November 2017
 */


public class SelectionSortTimer 
{
	public static void main(String[] args) 
	{
		SelectionSort<Integer> sorter = new SelectionSort<Integer>();
		RandomArray<Integer> generator = new RandomIntegerArray(10);
		
		sorter.timeInMillis(generator, 10, 5);
	}
}
