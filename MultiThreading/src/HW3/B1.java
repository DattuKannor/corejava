package HW3;

public class B1 extends Thread
{
	B2 b2;
	public B1(B2 b2) {
		
    this.b2=b2;
	}
	

	public void run()
	{
		try {
			b2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 100; i <=130; i++) 
		{
			System.out.println(": "+i);
		}
	}

}
