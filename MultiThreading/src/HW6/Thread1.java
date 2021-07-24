package HW6;

public class Thread1 extends Thread {
	Circle c;

	public Thread1(Circle c) {
		super();
		this.c = c;
	}
	public void run()
	{
		System.out.println(Thread.currentThread().getState());
		c.setRadius();
	}
		
	}