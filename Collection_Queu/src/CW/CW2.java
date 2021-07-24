package CW;

import java.util.Iterator;
import java.util.PriorityQueue;

public class CW2 {
//2) Write a Java program to iterate through all 
	//elements in priority queue.
	
public static void main(String[] args) {
		
		PriorityQueue q1=new PriorityQueue();
		
		q1.add("YELLOW");
		q1.add("BACK");
		
		q1.add("RED");
		q1.add("GREEN");
		q1.add("WHITE");
		q1.add("PINK");
		
		Iterator i=q1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
