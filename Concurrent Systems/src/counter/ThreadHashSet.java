package counter;

import java.util.HashSet;

/**
 * An implementation of thread set using hash set used to run the sets.
 * 
 * Starting and joining each thread in the set.
 * 
 * @author Lewis Scrivens
 * @version February 2018
 */

public class ThreadHashSet<T extends Thread> extends HashSet<T> implements ThreadSet<T>
{
	/**
     * Start and join each thread in this thread set.
     * 
     **/
	@Override
	public void runSet() throws InterruptedException 
	{
		// For each thread in this thread set start the thread.
		for (Thread thread: this)
		{
			thread.start();
		}
		// For each thread in this thread set join the thread.
		for (Thread thread: this)
		{
			thread.join();
		}
	}
}
