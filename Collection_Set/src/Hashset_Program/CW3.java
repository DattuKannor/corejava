package Hashset_Program;

import java.util.HashSet;
import java.util.Iterator;

public class CW3 {
//Write a Java program to get the 
	//number of elements in a hash set.
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
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
	
	System.out.println("Number of Element :"+h1.size());
	
		
	}

	
}
