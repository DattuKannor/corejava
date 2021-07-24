package LinkedList.hw;

import java.security.acl.LastOwnerException;
import java.util.LinkedList;

public class HW14 {
//	Write a Java program to get the first and last occurrence
//	of the specified elements in a
//	linked list
	
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
		
		l1.add(1);
		l1.add(1);
		
		System.out.println("First Occurance 1 :"+l1.indexOf(1)+" index");
		System.out.println("Last Occurance  1 :"+l1.lastIndexOf(1)+" index"); // here using last indext of 1 Element :Ans 8
		
	}

}
