package CW5;

public class Deamon extends Thread
{
	
 public void run()
 {
	 for (int i = 0; i <999; i++) {
		
		 System.out.println(Thread.currentThread().getName()+" : "+i);
	}
 }
 
 
 public static void main(String[] args) {
	Deamon t1=new Deamon();
	
	Deamon t2=new Deamon();
	
	t1.setDaemon(true);
	
	System.out.println("t1 is Deamoon ="+t1.isDaemon());
	System.out.println("t1 is Deamoon ="+t2.isDaemon());
	t2.isDaemon();
	t1.start();
	t2.start();
	
}
}
