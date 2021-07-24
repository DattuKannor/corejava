package CW9;

public class Prod_Cons {
	int n;
	   boolean value=false;
	  synchronized void get()
	  {
		if(!value)
		 {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		 }	
		System.out.println("Got : "+n);
		value=false;
		notify();
		
	 }
	  synchronized void put (int n)
	  {
		if(value)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.n=n;
		value=true;
		System.out.println("Put : "+n);
		notify();
		
	  }



























































}
