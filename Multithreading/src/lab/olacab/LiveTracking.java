package lab.olacab;

public class LiveTracking extends Thread
{
	@Override
	public void run() 
	{
		//int num =20;
		for(int i=20;i<=100;i+=20)
		{
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			IO.println("Updating ride location... "+i+"% completed");
		}
		IO.println("Ride completed!");
	}
	
}
