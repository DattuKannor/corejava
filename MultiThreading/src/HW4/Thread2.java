package HW4;

public class Thread2 extends Thread
{
	Thread t1;
	
	public Thread2(Thread t1) 
	{
		this.t1=t1;
	}
	
    @Override
	public void run() {


		m2();
		
		
		
	}
	
	
	synchronized void m2()
	{
		
		
		for (int i = 0; i <=5; i++) {
			System.out.println(i);
			
		}
	}
		

	
	
}
