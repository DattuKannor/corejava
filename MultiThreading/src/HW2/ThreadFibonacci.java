package HW2;

public class ThreadFibonacci  extends Thread
{

	public void run()
	{
		
		int a,b,c;
		
		a=0;
		 b=1;
		 c=1;
		 System.out.println(a +"\n"+b);
		 while(c<=10)
		 {
		    c=a+b;
		    a=b;
		    b=c;
		    
		    System.out.println(c);
		 }
		
		 
	}
	

}
