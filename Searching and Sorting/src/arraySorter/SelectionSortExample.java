package arraySorter;

import java.util.Arrays;

import RandomArray.*;

public class SelectionSortExample
{
	public static void main(String[] args) {
		SelectionSort<Integer> sorter = new SelectionSort<Integer>();
		Integer[] array = {1,2,4,2,70,4,5,6,3,8,4,100,-20};
		
		Timer timer = new Timer();
		
		timer.startTimer();
		sorter.sort(array);// Pass in the array that needs sorting...
		long timeTaken = timer.endTimer();
		
		System.out.println(Arrays.toString(array) + " Time Taken: " + timeTaken);
	}

}
