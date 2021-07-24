package HW2;

public class MainClass {

	public static void main(String[] args) {
		
		ThreadFirst t1=new ThreadFirst();
		ThreadSecond t2=new ThreadSecond();
		ThreadFibonacci t3=new ThreadFibonacci();
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
