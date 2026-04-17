package lab.day1_evenodd;

class Even extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		int c=0;
		//t.sleep(1000);
		//IO.println("The Even Numbers");
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
class Odd extends Thread
{
	@Override
	public void run()
	{
		Thread t = Thread.currentThread();
		int c=0;
		IO.println();
		//IO.println("\n\n The Odd Numbers");
		for(int i=2;i<=100;i++)
		{
			if(i%2==0) 
			{c++;
				IO.print(i+" by Thread-1\t");				
				if(c%5==0)
					IO.println();
			}
		}
	}
}

public class EvenAndOdd 
{
	void main() throws InterruptedException
	{
		Even e = new Even();
		Odd o = new Odd();
		e.start();
		e.join();
		o.start();
		o.join();
	}

}
