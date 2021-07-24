package HW;

import java.util.PriorityQueue;

public class HW1 {
	//Write a Java program to remove all the elements from a priority queue.

	
		public static void main(String[] args) {
			
			PriorityQueue q1=new PriorityQueue();
			
			q1.add("YELLOW");
			q1.add("BACK");
			
			q1.add("RED");
			q1.add("GREEN");
			q1.add("WHITE");
			q1.add("PINK");
			
			
			q1.offer("XYZ");
			System.out.println(q1);
			q1.removeAll(q1);
			System.out.println(q1);
		}

	}


