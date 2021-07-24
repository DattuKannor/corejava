package HW;

import java.util.PriorityQueue;

public class HW2 {
	//2) Write a Java program to count the number of elements in a priority queue
	
	public static void main(String[] args) {
		
		PriorityQueue q1=new PriorityQueue();
		
		q1.add("YELLOW");
		q1.add("BACK");
		
		q1.add("RED");
		q1.add("GREEN");
		q1.add("WHITE");
		q1.add("PINK");
		
		
		System.out.println("Number of Element Present `:"+q1.size());
		
	}

}
