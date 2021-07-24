package HW5;

public class Thread_22 extends Thread{

Class_Program_5 c;
	
	public Thread_22(Class_Program_5 c) {
		super();
		this.c = c;
	}
	public void run()
	{
		c.get();
	}
}
