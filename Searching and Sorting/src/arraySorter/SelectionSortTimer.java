package arraySorter;

import RandomArray.*;

public class SelectionSortTimer 
{
	public static void main(String[] args) 
	{
		
		SelectionSort<Integer> sorter = new SelectionSort<Integer>();
		RandomArray<Integer> generator = new RandomIntegerArray(10);
		
		sorter.timeInMillis(generator, 10, 5);
	}

}
