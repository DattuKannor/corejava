package Consumer_Procuccer;

public class Producer1 extends Thread 
{

	
	Q1 q;
	
	Producer1(Q1 q)
	{
		this.q=q;
	}
	
	
  @Override
public void run() {
	int i=0;
	
	while(true)
	{
		q.put(i++);
	}
}
	
}
