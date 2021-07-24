package LinkedList.hw;

import java.util.LinkedList;

public class HW25 {
	//Write a Java program to retrieve but does not remove, 
	//the last element of a linked list
	public static void main(String[] args) 
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add("Java");
		l1.add(1);
		


		
		System.out.println(l1);
		
		System.out.println("First Element :"+l1.getLast());
	}


}
