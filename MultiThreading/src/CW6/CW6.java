package CW6;

public class CW6 {
	public static void main(String[] args) {
		//WAP to give the implementation of a thread and pausing 
		//of a thread till completion of main thread using yield ().
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		t1.setPriority(6);
		t2.setPriority(8);
		System.out.println("Priority of thread t1 :=>"+t1.getPriority());
		System.out.println("Priority of thread t2 :=>"+t2.getPriority());
		t1.start();
		t2.start();
		for(int i=0;i<=500;i++)
		{
			Thread.yield();
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}
}
