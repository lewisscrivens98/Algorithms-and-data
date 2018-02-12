package arraySorter;

public class Timer 
{
	long startTime;
	long endTime;
	long totalTimeTaken;
	
	public void startTimer()
	{
		startTime = System.currentTimeMillis();
	}
	
	public long endTimer()
	{
		endTime = System.currentTimeMillis();
		
		totalTimeTaken = endTime - startTime;
		
		return totalTimeTaken;
	}
}
