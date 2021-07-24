package CW9;

public class Producer extends Thread{
	Prod_Cons q;

	public Producer(Prod_Cons q) {
		super();
		this.q = q;
	}
	public void run()
	{
		int i=1;
		while(i<=5){
			q.put(i++);
			}
	}
}