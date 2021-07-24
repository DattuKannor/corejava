package sychonized._2;



public class Thread1  extends Thread
{
	
Pattern p1;
	
	public Thread1(Pattern p1) 
	{
	  this.p1=p1;	
	}
	public void run() {
		
		p1.widraw();
		p1.display();
		
	}
}
