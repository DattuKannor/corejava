package CW7;

public class Exam extends Thread{
	Admmission a;
	
public Exam(Admmission a) {
		super();
		this.a = a;
	}

public void run()
{
	try {
		a.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Exam......");
}
}
