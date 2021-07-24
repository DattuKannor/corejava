package CW6;

public class Thread1 extends Thread{
	public void run()
    {
		
	for(int i=10;i<=13;i++)
		System.out.println(Thread.currentThread().getName()+" : "+i);
    }
}

