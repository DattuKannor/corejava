package LinkedList.hw;

import java.util.Collections;
import java.util.LinkedList;

public class HW6 
{
	//6) Write a Java program to
  //append the specified element to the end of a linked list.
   public static void main(String[] args)
   {
	LinkedList<Object> l1=new LinkedList<Object>();
	
	l1.add(1);
	l1.add("Java");
	l1.add(1.3f);
	l1.add(99);
	l1.add(true);
	l1.add(null);
	System.out.println(l1);
	l1.addLast(9999);

	System.out.println(l1);
    }
}
