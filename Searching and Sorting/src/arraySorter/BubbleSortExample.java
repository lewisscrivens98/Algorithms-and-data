package arraySorter;

import java.util.Arrays;

import RandomArray.*;

public class BubbleSortExample
{
	public static void main(String[] args) {
		BubbleSort<Integer> sorter = new BubbleSort<Integer>();
		Integer[] array = {1,2,4,2,70,4,5,6,3,8,4,100,-20};
		
		sorter.sort(array);// Pass in the array that needs sorting...
		System.out.println(Arrays.toString(array));
	}

}
