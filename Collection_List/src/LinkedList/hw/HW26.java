package LinkedList.hw;

import java.util.LinkedList;

public class HW26 {
//	Write a Java program to check if a particular
//	element exists in a linked list.
	
	public static void main(String[] args) 
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add("Java");
		l1.add(1);
		

  System.out.println(l1.contains(1));
		
	}

}
