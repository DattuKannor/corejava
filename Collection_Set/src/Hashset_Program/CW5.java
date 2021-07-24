package Hashset_Program;

import java.util.HashSet;
import java.util.Iterator;

public class CW5 {
	//Write a Java program to test a hash set is empty or not.

	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		
		System.out.println("Empty :"+h1.isEmpty());
		
		h1.add(3);
		h1.add(7); //Homogeous 
		h1.add(3.7);//hetrogeous
		h1.add("Hello");
		h1.add(null);
		h1.add(7);
		
	 Iterator i=h1.iterator();
	 
	 
	 while (i.hasNext())
	 {
		 System.out.println(i.next());
	}
	 System.out.println("Empty :"+h1.isEmpty());
	
	
		
	}
}
