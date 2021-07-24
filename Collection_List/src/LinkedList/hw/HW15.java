package LinkedList.hw;

import java.util.LinkedList;

public class HW15 {
//	Write a Java program to display the elements
//	and their positions in a linked list
	
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
		
		
		System.out.println(" Malhar found at Position :"+l1.indexOf("Malhar"));
		System.out.println(l1);
		
	}


}
