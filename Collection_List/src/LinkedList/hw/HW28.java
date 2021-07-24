package LinkedList.hw;

import java.util.ArrayList;
import java.util.LinkedList;

public class HW28 {
//Write a Java program to compare two linked lists.
	
	public static void main(String[] args) 
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add("Java");
		l1.add(1);
		
		LinkedList<Object> l2=new LinkedList<Object>();
		l2.add("Malhar");
		l2.add("Java");
		l2.add(1);
		
		System.out.println(l2.equals(l1));
	}

}
