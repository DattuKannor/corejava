package CW9;

public class Consumer extends Thread{

	
	Prod_Cons q;

	public Consumer(Prod_Cons q) {
		super();
		this.q = q;
	}
	public void run()
	{
		while(true)
		q.get();
	}
}
