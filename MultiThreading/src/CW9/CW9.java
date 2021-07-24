package CW9;

public class CW9 {
	public static void main(String[] args) {
		Prod_Cons q=new Prod_Cons();
		Producer p=new Producer(q);
		Consumer c=new Consumer(q);
		p.start();
		c.start();

	}

}
