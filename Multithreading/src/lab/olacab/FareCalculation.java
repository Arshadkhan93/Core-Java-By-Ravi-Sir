package lab.olacab;

public class FareCalculation extends Thread
{
	@Override
	public void run() 
	{
		IO.println("Calculating estimated fare...");
		try 
		{
			
			Thread.sleep(1500);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		IO.println("Estimated fare: 135.75 RS.");
	}

}
