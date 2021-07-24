package HW6;

public class Thread2 extends Thread {
	Circle c;

	public Thread2(Circle c) {
		super();
		this.c = c;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getState());
		c.area();
	}
		
	}