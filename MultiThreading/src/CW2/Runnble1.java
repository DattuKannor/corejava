package CW2;

public class Runnble1 implements Runnable
{

	public  void run()
	 {
		for (int i = 0; i <=5; i++) {
			
			System.out.println(Thread.currentThread().getName()+" :"+i);
			
		} 
		
	 }
}
