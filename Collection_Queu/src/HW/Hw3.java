package HW;

import java.util.PriorityQueue;

public class Hw3 {
	//3) Write a Java program to compare two priority queues.

public static void main(String[] args) {
		
		PriorityQueue q1=new PriorityQueue();
		
		q1.add("YELLOW");
		q1.add("BACK");
		
		q1.add("RED");
		q1.add("GREEN");
		q1.add("WHITE");
		q1.add("PINK");
		
PriorityQueue q2=new PriorityQueue();
		
		q2.add("YELLOW");
		q2.add("BACK");
	
		q2.add("RED");
		q2.add("GREEN");
		q2.add("WHITE");
		q2.add("PINK");
		
		
		System.out.println("Compare two PriorityQueu :"+q1.equals(q2));
		
	}
}
