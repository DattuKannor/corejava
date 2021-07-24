package HW;

import java.util.TreeSet;

public class HW5 {
//5) Write a Java program to add all the elements of a specified 
	//tree set to another tree set.
	
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		
		t1.add("Yello");
		t1.add("RED");
		t1.add("BLACK");
		t1.add("WHITE");
		t1.add("PINK");
		
		System.out.println(t1);
		System.out.println("---------------");
		TreeSet t2=new TreeSet(t1);
		System.out.println(t2);
	}

}
