package HW;

import java.util.PriorityQueue;

public class HW5 {
//5) Write a Java program to convert a priority queue to an array 
	//containing all of the elements of the queue.
public static void main(String[] args) {
		
		PriorityQueue q1=new PriorityQueue();
		
		q1.add("YELLOW");
		q1.add("BACK");
		
		q1.add("RED");
		q1.add("GREEN");
		q1.add("WHITE");
		q1.add("PINK");
		
		
		 String s[]=new String[q1.size()];
		 
		 Object o[]=q1.toArray();
		 
		 for (int i = 0; i < o.length; i++) 
		 {
			System.out.println(o[i]);
		}
		
		
}
}
