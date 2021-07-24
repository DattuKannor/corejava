package HW1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class HW4 {
//Write a Java program to create a set 
	//view of the mappings contained in a map
	
	public static void main(String[] args) {
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		
		h1.put(1,"SAGAR");
		h1.put(8,"DAttu");
		h1.put(2,"KK");
		h1.put(5,"RK");
		

System.out.println(h1.entrySet());

		
		
	}
	
}
