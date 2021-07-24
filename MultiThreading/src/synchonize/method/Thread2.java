package synchonize.method;

public class Thread2 extends Thread {

	Pattern p1;
	
	public Thread2(Pattern p1) 
	{
	  this.p1=p1;	
	}
	public void run() {
		
		p1.withdraw('#');
		
	}

}
