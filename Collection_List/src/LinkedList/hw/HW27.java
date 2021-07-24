package LinkedList.hw;

import java.util.ArrayList;
import java.util.LinkedList;

public class HW27 {
	//Write a Java program to convert a linked list to array list.
	
	public static void main(String[] args) 
	{
		
		LinkedList<Object> l1=new LinkedList<Object>();
		l1.add("Malhar");
		l1.add("Java");
		l1.add(1);
		
		ArrayList a1=new ArrayList(l1);
Object[] b=a1.toArray();

for (int i = 0; i < b.length; i++) {
	System.out.println(b[i]);
}
		System.out.println();
  System.out.println(a1);
		
	}

}
