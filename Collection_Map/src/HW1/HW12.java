package HW1;

import java.util.TreeMap;

public class HW12 {
//12) Write a Java program to get a key-value mapping associated with 
	//the greatest key less than or equal to the given key.
	
	
	//E.g : 1 2 3 4 5 6
	//5 
public static void main(String[] args) {
		
		TreeMap<Integer, String> h1=new TreeMap<Integer, String>();
			
			h1.put(1,"SAGAR");
			h1.put(8,"DAttu");
			h1.put(2,"KK");
			h1.put(5,"RK");
			
			for (int i = 2; i <8; i++) {
				if(h1.containsKey(i))
				System.out.println("Large Key :"+h1.ceilingEntry(i));
			}
			
			
			System.out.println("Set of Key"+h1.keySet());
			
			
	}

	
}
