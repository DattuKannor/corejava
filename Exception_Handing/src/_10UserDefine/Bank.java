package _10UserDefine;

import java.util.Scanner;

public class Bank {

	static double balance=90000.0;
	
	static void withdraw()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Withdraw Amount");
	    double amt=sc.nextDouble();
	    
	    if(amt>balance)
	    {
	    
	    	try {
				throw new InsufficientBalanace();
			} catch (InsufficientBalanace e) {
				System.out.println(e.getMessage());
			}
	    }
	    else
	    {
	    	balance=balance-amt;
	    	 System.out.println("Balance : "+balance );
	    }
	    
	   
	    
	}
	
	
	public static void main(String[] args) throws InsufficientBalanace 
	{
		
		withdraw();
		
		
	}
	
}
