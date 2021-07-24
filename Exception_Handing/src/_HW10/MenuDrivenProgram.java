package _HW10;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MenuDrivenProgram {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Menu:\t 1.Try Catch Demo\n\t2.Try Multi Catch \n\t3.Try Finally \n\t4.Try Catch Finally \n\t5.Throw  \n\t6.Throws");
		System.out.println("Enter ur choice:");
		int choice=sc.nextInt();
		double a=0;
		double b=0;
		switch (choice) {
		case 1:
			
			System.out.println("Enter Divided and Divisor");
			 a=sc.nextInt();
			 b=sc.nextInt();
			
			try
			{
				double c=a/b;
				System.out.println("Division "+c);
			}
			catch (ArithmeticException e) {
				System.out.println(e);
			}
			
			
			
			break;
			
case 2:
			
			int arr[]= {0,2,3,4,5};
			
			System.out.println("Enter index of array");
			int i=sc.nextInt();
			
			try
			{
				
				double c=10/arr[i];
				System.out.println("C="+c);
				
			}
			catch (ArithmeticException|ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			
			
			
			break;
			
case 3:
	
	
	
	System.out.println("Enter values of divisor");
	double x=sc.nextInt();
	
	try
	{
		
		double c=10/x;
	System.out.println("C="+c);
		
	}
	finally
	{
		System.out.println("Finally Excuted");
	}
	
	
	
	break;
	
case 4:
	
	
	
	System.out.println("Enter values of divisor");
	b=sc.nextInt();
	
	try
	{
		
		double c=10/b;
	System.out.println("C="+c);
		
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("Finally Excuted");
	}
	


		
		
		case 5:
			
			
			
			System.out.println("Enter Didided and divisor");
			b=sc.nextDouble();
			a=sc.nextDouble();
			
			if(a==0)
			{
			try
			{
				
				 throw new ArithmeticException("DIVIDED BY ZERO :");
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			}
			else
			{
				System.out.println("DIVISION :"+b/a);
			}
			
		case 6:
			
			demoThrows();
			break;

	default:
					System.out.println("u Enter Wrong choice");
					break;
					
				
			
			
			
		}
		
		
		
		
		
		
		
		
	}

	public static void demoThrows() throws FileNotFoundException {

        System.out.println("Throws Demo");
        FileReader fr =new FileReader("a.txt");
        
		
	}

}
