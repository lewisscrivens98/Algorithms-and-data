package intArrays;

import java.util.Arrays; // in order to be able to use the fill(...) method
/**
 * An extension of RandomCount
 * 
 * @author Hugh Osborne
 * @version September 2017
 */

public class SimpleRandomListing extends RandomListing
{
	//Timer Variable
	static long timeTaken;

    public SimpleRandomListing(int size) 
    {
        super(size);
    }

    protected void randomise() 
    {
    	// Start Time
    	startTimer();
    	
    	
    	//Used to create a copy of the random item
        int[] copy = new int[getArray().length];
        int randomIndex;
        
        //Used to indicate if elements have been used
        boolean[] used = new boolean[getArray().length];
        Arrays.fill(used,false);//Assigns each item in the used array with a boolean
        
        for (int i = 0; i < getArray().length; i++) 
        {
			do 
        	{
                randomIndex = getRandomIndex();//Method for generating random index
                
            } while (used[randomIndex]);//Check to see if the array item has been swapped yet
        	
            copy[i] = getArray()[randomIndex];//Create a copy of the item with the random index
            used[randomIndex] = true;//Set the item in the used array to true
        }
        
        for (int i = 0; i < getArray().length; i++) 
        {
            getArray()[i] = copy[i];//Replace the item with the copy with a random index
        }
        
        
        
        // End Time
        timeTaken = endTimer();
    }
    
    public static void main(String[] args) 
    {
    	RandomListing count = new SimpleRandomListing(1000);
    	System.out.println(Arrays.toString(count.getArray()));
    	System.out.println("Time Taken: " + timeTaken);    
    }
} // End of class SimpleRandomListing