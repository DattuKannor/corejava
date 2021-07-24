package HW6;

public class HW6 {
	//6) Create Circle class having setRadius(),area(). 
//One thread is calling setRadius(),another thread is calling area().
// Using wait () and notify () implements this program.
	
	
	
	public static void main(String[] args) {
		Circle c=new Circle();
		
		Thread1 t1=new Thread1(c);
		Thread2 t2=new Thread2(c);
		
		t1.start();
		t2.start();
		
		

	}

}
