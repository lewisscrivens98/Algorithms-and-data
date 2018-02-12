package intArrays;

import java.util.Arrays;

/**
 * An improvement of SimpleRandomListing used to randomly shuffle a given array.
 * 
 * @author Lewis Scrivens
 * @version September 2017
 */

public class CleverRandomListing extends RandomListing
{
	// Variable for printing the time taken for the randomise function to run.
	public static long timeTaken;
	
    public CleverRandomListing(int size) 
    {
        super(size);
    }

    protected void randomise() 
    {
    	startTimer();// Start Timer
    	
    	// Create local variables
    	int copy;
    	int randomIndex;
    	int arraySize = getArray().length;
    	
    	// For every value in the array swap with a random value in the array.
    	for (int i = 0; i < arraySize; i++)
    	{
    		randomIndex = getRandomIndex();
    		
    		// Create copy of array at i.
    		copy = getArray()[i];
    		// Set element of array at i to the element at the randomIndex.
    		getArray()[i] = getArray()[randomIndex];
    		// Set element of array at the randomIndex to the element at i.
    		getArray()[randomIndex] = copy;
    	}
    	
    	timeTaken = endTimer();// End Timer
    }
    
    public static void main(String[] args) 
    {
    	// Create a new clever random listing of size 10,000.
    	RandomListing count = new CleverRandomListing(1000);
    	System.out.println(Arrays.toString(count.getArray()));
    	
    	// Print the total time taken to the console.
    	System.out.println("Time Taken: " + timeTaken);
    }

} // End of class CleverRandomListing