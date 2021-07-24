package Consumer_prodceducer_5_5;

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
	int j=1;
	while(j>=5)
	{
		q.put(i++);
		j++;
	}
}
	
}
