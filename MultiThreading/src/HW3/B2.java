package HW3;

public class B2  extends Thread
{

	public void run()  //throws InterruptedException
	{
		
		
		for (char i ='A'; i <='Z'; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(": "+i);
			
		}
	}
}
