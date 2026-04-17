package lab.day1_evenodd;

class child extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		int c=0;
		for(int i=0;i<=100;i++)
		{
			if(i%2!=0) 
			{c++;
				IO.print(i+" by Thread-0\t");				
				if(c%5==0)
					IO.println();
			}
		}
	}
}

public class PrintEven
{
	void main()
	{
		child c= new child();
		Thread t = Thread.currentThread();
		try {
			c.start();
			c.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		int co=0;
		for(int i=2;i<=100;i++)
		{			
			if(i%2==0)
			{
				IO.print(i+" by main\t");
				co++;				
				if(co%5==0)
					IO.println();
			}
		}
	}

}
