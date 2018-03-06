package counter;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountTest {
	
	private ThreadSet<Counter> countSet;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		Counter.traceOn();
		Counter.setDelay(1); // Delay
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		
	}

	@Before
	public void setUp() throws Exception 
	{
		countSet = new ThreadHashSet<Counter>();
	}

	@After
	public void tearDown() throws Exception 
	{
		
	}

	/* DISABLED
	@Test
	public void test_5_10_and_5_0() throws InterruptedException 
	{
		countSet.add(new Counter(5,10));
		countSet.add(new Counter(5,0));
		countSet.runSet();
	}
	*/
	
    /**
     * Method to test running a counter from 0 to 10 and 10 to 0 at
     * the same time so it can be observed in the console.
     * 
     * @author Lewis Scrivens
     **/
	@Test
	public void test_0_10_and_10_0() throws InterruptedException 
	{
		countSet.add(new Counter(0,10));
		countSet.add(new Counter(10,0));
		
		countSet.runSet();
	}
	
}
