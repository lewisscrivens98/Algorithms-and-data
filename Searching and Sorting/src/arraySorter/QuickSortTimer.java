package arraySorter;

import RandomArray.*;

/**
 * A timer for the QuickSort class to time how many milliseconds it 
 * takes for a random array of different sizes.
 * 
 * @author Lewis Scrivens
 * @version November 2017
 */

public class QuickSortTimer 
{
	public static void main(String[] args) 
	{
		QuickSort<Integer> sorter = new QuickSort<Integer>();
		RandomArray<Integer> generator = new RandomIntegerArray(10);
		sorter.timeInMillis(generator, 10, 5);
	}
}
