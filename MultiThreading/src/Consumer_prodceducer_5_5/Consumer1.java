package Consumer_prodceducer_5_5;

public class Consumer1 extends Thread
{
   Q1 q;
   
   Consumer1(Q1 q)
   {
	   this.q=q;
   }
   
   
   public void run()
   {
	   int i=1;
	   while(i>=5)
	   {
		  q.get(); 
		  i++;
	   }
   }
}
