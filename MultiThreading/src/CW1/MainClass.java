package CW1;

public class MainClass {
	
	public static void main(String[] args) {
		
		//System.out.println();
		System.out.println(Thread.currentThread().getName());
		
		Thread1 t1=new Thread1();
		
		Thread2 t2=new Thread2();
		t1.start();
		t2.start();
	}

}
