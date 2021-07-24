package HW3;

public class MainClass 

{

	public static void main(String[] args) {
	 
	
	  B2 b2=new B2();
		B1 b1=new B1(b2);
	  b1.start();
	  b2.start();
	}
}
