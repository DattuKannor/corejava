package HW;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class HW6 {
//6) Write a Java program to create a reverse order 
	//view of the elements contained in a given tree set.
	
	
		
		public static void main(String[] args) {
			TreeSet t1=new TreeSet();
			
			t1.add(8);
			t1.add(88);
			t1.add(9);
			t1.add(8);
			t1.add(4);
			
			System.out.println(t1);
			System.out.println("---------------");


			
			LinkedList l1=new LinkedList(t1);
			
			
			ListIterator i=l1.listIterator();
			
			while (i.hasPrevious())
				System.out.println(i.previous());
			}
		

	}
	


