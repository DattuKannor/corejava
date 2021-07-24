package Hashset_Program;

import java.util.HashSet;
import java.util.Iterator;

public class CW6 {
	//Write a Java program to clone a hash set to another hash set.

	
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		
		
		
		h1.add(3);
		h1.add(7); //Homogeous 
		h1.add(3.7);//hetrogeous
		h1.add("Hello");
		h1.add(null);
		h1.add(7);
		
		HashSet h2=new HashSet();
		h2=(HashSet)h1.clone();
		
		System.out.println(h2);
		
	     
	
		
	}
	
}
