package CW6;

public class Thread2 extends Thread{
	  public void run()
	  {
		  for(int i=0;i<3;i++)
		  {
			  
		  System.out.println("Sunday Monday Tuesday Wednesday Thursday Friday Saturday");
		  System.out.println(Thread.currentThread().getName()+" : "+i);
	  }}

}
