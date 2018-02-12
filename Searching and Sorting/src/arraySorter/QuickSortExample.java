package arraySorter;

import java.util.Arrays;

public class QuickSortExample 
{
	public static void main(String[] args) 
	{
		QuickSort<Integer> sorter = new QuickSort<Integer>();
		Integer[] array = {200,2,4,2,70,4,5,6,3,8,4,100,-20};
		
		sorter.sort(array);// Pass in the array that needs sorting...
		System.out.println(Arrays.toString(array));
	}
}
