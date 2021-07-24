package LinkedList.hw;

import java.util.LinkedList;

public class HW18 {
//	Write a Java program to 
//	remove all the elements from a linked list
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
		System.out.println("--Before Remove all--");
		System.out.println(l1);
		
		System.out.println("\n\n--After Remove all--");
		l1.removeAll(l1);
		
		
		System.out.println(l1);
		
	}
}
