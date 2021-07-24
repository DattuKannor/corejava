package LinkedList.hw;

import java.util.LinkedList;

public class HW8
{
//	Write a Java program to insert the specified element 
//	at the specified position in the linked list.
	
	public static void main(String[] args)
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add(1);
		l1.add("Java");
		l1.add(1.3f);
		l1.add(99);
		l1.add(true);
		l1.add(null);
		
		l1.addLast(9999);
		
		
		l1.add(2, "Malhar");
		
		System.out.println(l1);
		
		
	}
}
