package LinkedList.hw;

import java.util.LinkedList;

public class HW22 {
	//Write a Java program to clone an linked list to another linked list.
	public static void main(String[] args) 
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add(1);
		l1.add("Java");
		LinkedList<Object> l2=new LinkedList<Object>();
		
		
		l2=(LinkedList)l1.clone();
		System.out.println(l2);
		
		
		
		
	}
}
