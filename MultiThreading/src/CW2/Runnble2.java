package CW2;

public class Runnble2 implements Runnable
{
   public void run()
   {
	   for (int i = 0; i <=5; i++) 
	   {
		   try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  System.out.println(":"+i);	
	}
   }
}
