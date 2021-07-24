package HW5;

public class Thread_11 extends Thread{
	Class_Program_5 c;
	
	public Thread_11(Class_Program_5 c) {
		super();
		this.c = c;
	}

	public void run()
	{
		c.print();
	}
}