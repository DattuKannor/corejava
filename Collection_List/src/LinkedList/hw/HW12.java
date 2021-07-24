package LinkedList.hw;

import java.util.LinkedList;

public class HW12 {
//	Write a Java program to insert some elements
//	at the specified position into a linked list
	
	public static void main(String[] args) 
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add(1);
		l1.add("Java");
		l1.add(1.3f);
		l1.add(99);
		l1.add(true);
		l1.add(null);
		
		l1.add(1,3);
		l1.add(4,3);
		l1.add(0,3);
		
		
		System.out.println(l1);
		
	}

}
