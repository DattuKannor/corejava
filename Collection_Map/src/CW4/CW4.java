package CW4;

import java.util.HashMap;

public class CW4 {
	
	//Write a Java program to remove all of the mappings from a map
	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
			
			h1.put(1,"SAGAR");
			h1.put(8,"DAttu");
			h1.put(2,"KK");
			h1.put(5,"RK");
			
			h1.clear();
			System.out.println(h1);
	}

}
