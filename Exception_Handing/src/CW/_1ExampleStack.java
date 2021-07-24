package CW;

public class _1ExampleStack {
	
	static void m1()
	{
		System.out.println("m1 Start....");
		m2();
		System.out.println("m1 End....");
		
	}
	 static void m2()
	 {
		 int a=10;
		 System.out.println("m2 Start....");
		 int b=a/0;
		 System.out.println("m2 End....");
		 
	 }
	 
	 public static void main(String[] args) {
		System.out.println("Main start....");
		m1();
		System.out.println("Main End....");
		 
	}

}
