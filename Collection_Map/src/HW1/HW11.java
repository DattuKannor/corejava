package HW1;

import java.util.HashMap;
import java.util.TreeMap;

public class HW11 {
//11) Write a Java program to get a key-value mapping 
	//associated with the greatest key and the least key in a map.
public static void main(String[] args) {
		
		TreeMap<Integer, String> h1=new TreeMap<Integer, String>();
			
			h1.put(1,"SAGAR");
			h1.put(8,"DAttu");
			h1.put(2,"KK");
			h1.put(5,"RK");
			
			System.out.println("Large Key :"+h1.lastEntry());
			System.out.println("Large Key :"+h1.firstEntry());
			
			//System.out.println("Set of Key"+h1.keySet());
			
			
	}

}
