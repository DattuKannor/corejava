package LinkedList.hw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class HW7 
{
// Write a Java program to iterate a linked list in reverse order.
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
		
		ListIterator i=l1.listIterator(l1.size());
		
		while(i.hasPrevious())
		{
			System.out.println(i.previous());
		}

		
		

		
	}
}
