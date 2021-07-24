package CW;

public class _2CW {
//	Show Example of run time stack mechanism using 
//	Arithmetic Exception and handle it using try catch.
	static void m1()
	{
		System.out.println("Strat m1...");
		m2();
		System.out.println("End m1...");
	}
	
	static void m2()
	{
		int a=10;
		System.out.println("Strat m2...");
		
		try {
			
			int b=a/0;
		} catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("End m2...");
	}
	
	
	public static void main(String[] args) {
		
		
		System.out.println("Strat main...");
		m1();
		System.out.println("End main...");
		
	}

}
