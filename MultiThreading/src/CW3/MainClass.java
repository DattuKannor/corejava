package CW3;

public class MainClass
{
  public static void main(String[] args) {
	
	  Thread1 t1=new Thread1();
	  Thread2 t2=new Thread2();
	  
	  t1.setPriority(8);
	  t2.setPriority(6);
	  t1.start();
	  t2.start();
	 Thread.currentThread().setPriority(4);
	 // t2.setPriority(2);
	 // System.out.println(t1.getPriority());
	  
	  for (int i = 1; i <=500; i++) 
	  {
		  Thread.yield();
		System.out.println(Thread.currentThread().getName()+" : "+i);
	}
	  
}
}
