package Hashset_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;

import javax.swing.plaf.SliderUI;

public class CW2 {
//	Write a Java program to iterate
//through all elements in a hash list

	
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
	
	
	
		
	}
}
