package HW1;

import java.util.HashMap;

public class HW2 {
	//Write a Java program to test if a map contains 
	//a mapping for the specified key.
	public static void main(String[] args) {
		
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		
		h1.put(1,"SAGAR");
		h1.put(8,"DAttu");
		h1.put(2,"KK");
		h1.put(5,"RK");
		
		System.out.println("PRESENT :"+h1.containsKey(1));
	}
}
