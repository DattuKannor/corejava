package Consumer_Procuccer;

public class Consumer1 extends Thread
{
   Q1 q;
   
   Consumer1(Q1 q)
   {
	   this.q=q;
   }
   
   
   public void run()
   {
	   while(true)
	   {
		  q.get(); 
	   }
   }
}
