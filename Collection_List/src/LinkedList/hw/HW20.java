package LinkedList.hw;

import java.util.Collections;
import java.util.LinkedList;

public class HW20 {
	//Write a Java program to shuffle the elements in a linked list.
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
		
		Collections.shuffle(l1);
		
		System.out.println(l1);
		
	}

}
