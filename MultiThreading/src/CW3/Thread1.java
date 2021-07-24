package CW3;

public class Thread1  extends Thread{
	
	public void run()
	{
		
		for (int i = 0; i <=7; i++) {
			System.out.println(Thread.currentThread().getName()+" :"+i);
		}
	}

}
