package StackArray;

import java.util.Scanner;

public class StackDemo {
	int top=-1;
	
	int stack[]=new int[6];
	
	StackDemo()
	{
	
		for (int i = 0; i < stack.length; i++) {
			stack[i]=-1;
		}
	}
	
	void push(int n)
	{
		if(top==stack.length-1)
		{
			System.out.println("Stack Overfull");
		}
		else
		{
			top++;
			stack[top]=n;
			System.out.println(n+" PUSH SUCCESSFULLY.......");
		}
	}
	
	
	void  dislay()
	{
		if(top==-1)
		{
			System.out.println("Stack Empty........");
		}
		else
		{
			for (int i = 0; i < top+1; i++) {
				System.out.print(stack[i]+" ");
			}
		}
	}
	
	
	void pop()
	{
		
		if(top==-1)
		{
			System.out.println("Stack is Empty...");
		}
		else
		{
			int n=stack[top];
			stack[top]=-1;
			top--;
			System.out.println(n+ "POP SUCESSFULLY.....");
		}
		
		
	}
	
	public static void main(String[] args) 
	{
		StackDemo s=new StackDemo();
		Scanner sc=new Scanner(System.in);
		char n;
		System.out.println("***STACK****");
		
		do {	
		System.out.println("1.PUSH \n2.POP 3.\n 3.SHOW STACK \n4.Exit");
		System.out.println("Enter u r Choice :");
		int choice=sc.nextInt();
		
		
		switch (choice) {
		case 1:
			System.out.println("Enter Push Element ");
			
			  s.push(sc.nextInt());
			break;
			
         case 2:
			   s.pop();
			break;		 
			
         case 3:
 			   s.dislay();
 			break;
         case 4:
        	 System.out.println("Exited......");
 			System.exit(0);
 			break;
			

		default:
			break;
		}//Switch ENd
		
		System.out.println("\ndo want to contineous...(N/Y)?");
		n=sc.next().charAt(0);
		}while(n!='n');
//		s.push(10);
//		s.push(20);
//		s.push(3);
//		s.push(80);
//		
//		s.pop();
//		s.dislay();
	}

}
