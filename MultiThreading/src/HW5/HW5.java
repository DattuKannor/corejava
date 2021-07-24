package HW5;

public class HW5 {
	public static void main(String[] args) {
		Class_Program_5 c=new Class_Program_5();
		Thread_11 tt1=new Thread_11(c);
		Thread_22 tt2=new Thread_22(c);
		tt1.start();
		tt2.start();
	}

}
