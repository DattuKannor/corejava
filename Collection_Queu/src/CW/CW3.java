package CW;

import java.util.PriorityQueue;

public class CW3 {
	//3) Write a Java program to add all the elements of 
	//a priority queue to another priority queue
public static void main(String[] args) {
		
		PriorityQueue q1=new PriorityQueue();
		
		q1.add("YELLOW");
		q1.add("BACK");
		
		q1.add("RED");
		q1.add("GREEN");
		q1.add("WHITE");
		q1.add("PINK");
		
		//System.out.println(q1.hashCode(1));
		PriorityQueue q2=new PriorityQueue(q1);
		
		System.out.println(q2);
	}

}
