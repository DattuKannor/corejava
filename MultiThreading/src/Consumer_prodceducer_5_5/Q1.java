package Consumer_prodceducer_5_5;

public class Q1 {
	int n;
	
	boolean valueSet=false;
	
	synchronized void get()
	{
		if(!valueSet)
		{
			try {
				wait();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
		}//end if
		
		System.out.println("GOT :"+n);
		valueSet=true;
		
		notify();
	}//end get
	
	
	
	synchronized void put(int n)
	{
		if(valueSet)
		{
			
				try {
					wait();
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			
		}
		this.n=n;
		valueSet=true;
		System.out.println("put :"+n);
		notify();
		
	}

	
	

}
