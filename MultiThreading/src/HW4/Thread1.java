package HW4;

public class Thread1 extends Thread{
	
	@Override
	public void run() {


		m1();
		
		
		
	}
	
	
	synchronized void m1()
	{
		
		
		for (int i = 0; i <=5; i++) {
			System.out.println(i);
			
		}
	}
		
	
}
