package LinkedList.hw;

import java.util.LinkedList;

public class HW29 {
	//Write a Java program to replace an element in a linked list.

	public static void main(String[] args) 
	{
		
		
		LinkedList<Object> l2=new LinkedList<Object>();
		l2.add("Malhar");
		l2.add("Java");
		l2.add(1);
		
		l2.set(1,"Core Java");
		System.out.println(l2
				);
	}

}
