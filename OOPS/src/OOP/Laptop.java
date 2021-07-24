package OOP;

import java.util.Scanner;

public class Laptop {
	

	

	void calculator()
	{
		char n;
		do {
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("1.Addtion\n2.Substraction\n3.Muplication\n4.Division\n5.Quit   ");
		System.out.println("Enter Option");
		int ch=sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter First Number");
			a=sc.nextInt();
			System.out.println("Enter Second Number");
			b=sc.nextInt();
			c=a+b;
			System.out.println("The Result is :"+c);
			
			break;
			
		case 2:
			System.out.println("Enter First Number");
			a=sc.nextInt();
			System.out.println("Enter Second Number");
			b=sc.nextInt();
			c=a-b;
			System.out.println("The Result is :"+c);
			
			break;

		case 3:
			System.out.println("Enter First Number");
			a=sc.nextInt();
			System.out.println("Enter Second Number");
			b=sc.nextInt();
			c=a*b;
			System.out.println("The Result is :"+c);
			
			break;
		case 4:
			System.out.println("Enter First Number");
			a=sc.nextInt();
			System.out.println("Enter Second Number");
			b=sc.nextInt();
			c=a/b;
			System.out.println("The Result is :"+c);
			
			break;
			
			
		case 5:
			System.out.println("Exiteddd......");
			System.exit(0);

			break;

		
		}//swich
		System.out.println("do U want to contineoous..(Y/N)");
		n=sc.next().charAt(0);
		
		
		}while(n!='n' || n!='N');
		

}//Method 
	
	

}//class