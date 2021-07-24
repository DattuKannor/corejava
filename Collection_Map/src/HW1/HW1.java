package HW1;

import java.util.HashMap;

public class HW1 {
	//Write a Java program to check whether a map contains 
	//key-value mappings (empty) or not.
	public static void main(String[] args) {
		
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
			
			h1.put(1,"SAGAR");
			h1.put(8,"DAttu");
			h1.put(2,"KK");
			h1.put(5,"RK");
			
			System.out.println(h1.containsValue("SAGAR"));
			System.out.println(h1.containsKey(2));
			
			System.out.println(h1.containsValue("XZ"));
			
	}

}
