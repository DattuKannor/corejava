package HW;

import java.util.HashSet;
import java.util.TreeSet;

public class Hw1 {
	//1)Write a Java program to compare two hash set. 

	
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
		System.out.println("Compare two hash Set :"+h1.equals(h2));
		
		
		
	}
}
