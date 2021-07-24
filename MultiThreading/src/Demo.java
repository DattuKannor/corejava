
public class Demo extends Thread 
{
	public void run()
	{
		for (int i = 0; i <=5; i++) 
		{
			System.out.println(this.getName()+":"+i);
			
		}
	}
	
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		
		Demo d2=new Demo();
		Demo d3=new Demo();
		
		d3.setName("d3");
		d2.setName("d2");
		d1.setName("d1");
		
		d1.setPriority(5);//Thread-0
		d2.setPriority(1);//Thread-1
		d3.setPriority(2);  //Thread-2
		
		
		d1.start();
		d2.start();
		d3.start();
		
		
		for (int i = 0; i <=5; i++) {
			
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
		
	}

}
