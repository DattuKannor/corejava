package HW1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class HW14 {
//14) Write a Java program to get a reverse order view of the keys 
	//contained in a given map.
	public static void main(String[] args) {

		TreeMap<Integer, String> h1=new TreeMap<Integer, String>();
			
			h1.put(1,"SAGAR");
			h1.put(8,"DAttu");
			h1.put(2,"KK");
			h1.put(5,"RK");
			
			
		ArrayList a1=new ArrayList(h1.keySet());
		
		Collections.reverse(a1);
		System.out.println(a1);
			
			
	}

	}
	

