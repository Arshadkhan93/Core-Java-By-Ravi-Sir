package lab.day1_evenodd;

class Even1 extends Thread
{
	@Override
	public void run() 
	{
		synchronized (Even1.class) {
			synchronized (Odd1.class) {
			
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			IO.println(i+" \t Even");		
		}
			}
		}
	}
}
class Odd1 extends Thread
{
	@Override
	public void run() 
	{
		synchronized (Even1.class){
			synchronized (Odd1.class){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		
		for(int i=0;i<20;i++)
		{
			if(i%2!=0)
			IO.println(i+" \t ODD");		
		}
			}
		}
	}
	
}



public class EvenAndOddThread {
	static Odd1 o = new Odd1();
	static Even1 e = new Even1();
	
	public static void main(String[] args) throws InterruptedException {
		
		
		o.start();
		
		e.start();
		
		
	}

}
