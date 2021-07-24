package HW1;

public class MainClass 
{

	public static void main(String[] args) {
		
		Runnable1 r1=new Runnable1();
		Runnable1 r2=new Runnable1();
		
		r1.start();
		r2.start();
		
	}
}
