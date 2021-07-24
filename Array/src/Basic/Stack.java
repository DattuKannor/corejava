package Basic;

import java.util.Scanner;

public class Stack {

	int top=-1;
	
	int stack []=new int[5];
	
	
		public Stack()
		{
			
			for (int i = 0; i < stack.length; i++)
			{
				stack[i]=-1;
			}
	
		}//Constrictor
	
	void display()
	{
		if(top==-1)
		{
			System.out.println("Stack Empty");
		}
		else
		{
			for (int i = 0; i < top+1; i++) {
				System.out.println(stack[i]);
			}
		}
	}
		
		
		
	void push(int n)
	{
		if(top==stack.length-1)
		{
			System.out.println("Stack OverFlow");
		}
		else
		{
			top++;
			stack[top]=n;
			System.out.println("Push suu");
		}
	}
		public static void main(String[] args) {
			
			Scanner  sc=new Scanner(System.in);
			Stack s=new Stack();
			//s.display();
			System.out.println("Emter push Element");
			int x=sc.nextInt();
			s.push(x);
			s.display();
		}
	
	
}
