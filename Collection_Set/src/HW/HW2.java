package HW;

import java.util.HashSet;
import java.util.TreeSet;

public class HW2 {
	//Write a Java program to compare two 
	//sets and retain elements which are same on both sets.
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		
		
		
		h1.add(3);
		h1.add(7); //Homogeous 
		h1.add(9);//hetrogeous
		h1.add(10);
		
HashSet h2=new HashSet();
		
		
		
		
		h2.add(3);
		h2.add(7); //Homogeous 
		h2.add(9);//hetrogeous
		h2.add(10);
		h2.add(0);
		h2.add(90);
		System.out.println("Compare two hash Set :"+h1.equals(h2));
		
		
	h1.retainAll(h2);
	
	System.out.println(h1);
	}
}
