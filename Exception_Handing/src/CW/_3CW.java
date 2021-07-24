package CW;

import java.util.Scanner;
//Show example on unchecked exception and use multiple catch blocks.
public class _3CW {
	
	
	
	static void m1()
	{
		System.out.println("Strat m1...");
		m2();
		System.out.println("End m1...");
		
	}
	
	static void m2()
	{
		int a[]={0,1,2,4,5};
		System.out.println("strat m2...");
		m3();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of a[]");
		int i=sc.nextInt();
		try
		{
			int b=10/a[i];
			//System.out.println("b :"+b);
		}
		catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
		}
		System.out.println("strat m2...");
	}

	static void m3() 
	{
		System.out.println("strat m3...");
		System.out.println("strat m3...");
	}
	
	
	public static void main(String[] args) {
		System.out.println("strat main...");
		m1();
		System.out.println("strat main...");
		
	}
	
}


