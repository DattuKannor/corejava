package HW1;

import java.util.TreeMap;

public class HW13 {
//13) Write a Java program to get the greatest 
	//key less than or equal to the given key.
	
	public static void main(String[] args) {

		TreeMap<Integer, String> h1=new TreeMap<Integer, String>();
			
			h1.put(1,"SAGAR");
			h1.put(8,"DAttu");
			h1.put(2,"KK");
			h1.put(5,"RK");
			
			System.out.println("Large Key :"+h1.ceilingKey(6));
			
			System.out.println("Set of Key"+h1.keySet());
			
			
	}

	}
	

