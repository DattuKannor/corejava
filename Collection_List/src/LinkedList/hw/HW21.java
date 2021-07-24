package LinkedList.hw;

import java.util.Collections;
import java.util.LinkedList;

public class HW21 {
//Write a Java program to join two linked lists.
	public static void main(String[] args) 
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add(1);
		l1.add("Java");
		LinkedList<Object> l2=new LinkedList<Object>();
		l2.add(1);
		l2.add(2);
		l2.add(8);
		
		
	
		System.out.println("\n--1st Link List--");
		System.out.println(l1);
		System.out.println("\n--2nd Link List--");
		System.out.println(l2);
		
		System.out.println("\n\n --concate 1st and 2nd --");
		l1.addAll(l2);
		
		System.out.println(l1);
		
		
		
	}
}
