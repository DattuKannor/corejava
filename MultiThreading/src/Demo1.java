
public class Demo1 extends Thread{
	
	public void run()
	{
		System.out.println("hello");
		for (int i = 0; i <3; i++) 
		{
			System.out.println(this.getName()+":"+i);
			
		}
	}
	
	
	public static void main(String[] args) {
		Demo d1=new Demo();
		
		Demo d2=new Demo();
		//Demo d3=new Demo();
		
		d1.start();
		d2.start();
		
		
		
		for (int i = 0; i <3; i++) {
			
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+":"+i);
			
		}
		
	}

	

}
