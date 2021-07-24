package LinkedList.hw;

import java.util.Collections;
import java.util.LinkedList;

public class HW19 {
	public static void main(String[] args) 
	{
		//Write a Java program of swap two elements
		//in an linked list
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add(1);
		l1.add("Java");
		l1.add(1.3f);
		l1.add(99);
		l1.add(true);
		l1.add(null);
		
		
		
		
		Collections.swap(l1, 0, 1);
		System.out.println(l1);
		
	}


}
