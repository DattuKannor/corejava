package CW7;

public class Admmission extends Thread{
	
	Registration  r;
	

public Admmission(Registration r) {
		super();
		this.r = r;
	}


public void run()
{
	try {
		r.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Admmission ........");
}

}