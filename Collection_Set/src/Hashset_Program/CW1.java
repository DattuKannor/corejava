package Hashset_Program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class CW1 {
	//Write a Java program to append the specified element 
	//to the end of a hash set
	
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		h1.add(3);
		h1.add(7); //Homogeous 
		h1.add(3.7);//hetrogeous
		h1.add("Hello");
		
		
		
	ArrayList l=new ArrayList(h1);
	l.add(99);
	
	System.out.println(l);
		
	}

}
