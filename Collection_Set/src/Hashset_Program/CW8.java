package Hashset_Program;

import java.util.HashSet;
import java.util.TreeSet;

public class CW8 {
	//Write a Java program to convert a hash set to a tree
	
	
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		
		
		
		h1.add(3);
		h1.add(7); //Homogeous 
		h1.add(9);//hetrogeous
		h1.add(10);
		
		TreeSet t1=new TreeSet(h1);
		t1.add(100);
		System.out.println(t1);
	}

}
