package CW;

import java.util.Scanner;

public class _4CW {
	
//Show Example to check whether Unchecked Exception is propagated in calling stack
	
	static void m1()
	{
		
		System.out.println("Strat m1...");
		m2();
		System.out.println("End m1...");
		
	}
	
	static void m2()
	{
		
		System.out.println("strat m2...");
		m3();
		
		
		
			int b=10/0;
			//System.out.println("b :"+b);
		
		
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
