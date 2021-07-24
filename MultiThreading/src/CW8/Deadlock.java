package CW8;

public class Deadlock {
	synchronized public void add()
	{
		for(int i=0;i<5;i++)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		notify();
	}
	synchronized public void sub()
	{
		for(int i=11;i<=15;i++)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		notify();
	}


}
