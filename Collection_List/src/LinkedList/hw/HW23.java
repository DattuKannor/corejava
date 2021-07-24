package LinkedList.hw;

import java.util.LinkedList;

public class HW23 {
//Write a Java program to remove and return 
	//the first element of a linked list.
	public static void main(String[] args) 
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add(1);
		l1.add("Java");


		System.out.println("REMEOVE  :"+l1.remove(1));
		System.out.println(l1);
		
		
		
		
		
	}
}
