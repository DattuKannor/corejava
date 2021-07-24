package HW;

import java.util.Iterator;
import java.util.PriorityQueue;

public class HW4 {
	//4) Write a Java program to retrieve the first element of the priority queue.

public static void main(String[] args) {
		
		PriorityQueue q1=new PriorityQueue();
		
		q1.add("YELLOW");
		q1.add("BACK");
		
		q1.add("RED");
		q1.add("GREEN");
		q1.add("WHITE");
		q1.add("PINK");
		
		
		System.out.println(q1);
		System.out.println(q1.peek());
		
}
}
