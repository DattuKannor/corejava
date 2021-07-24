package _9HWUserDefine;

import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Dividend");
		int div=sc.nextInt();
		
		System.out.println("Enter divisor");
		int divisor=sc.nextInt();
		
		Demo d=new Demo();
		try
		{
			
		d.division(div, divisor);
		
		}
		catch (ArithmeticException e) {
			System.out.println("Divisor can not be zero");
		}
		finally
		{
			System.out.println("The Result :"+d.result);
		}
		

	}

}
