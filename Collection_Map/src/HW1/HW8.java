package HW1;

import java.util.HashMap;
import java.util.TreeMap;

public class HW8 {
	//8) Write a Java program to associate the specified value with the specified 
	//key in a Tree Map
	public static void main(String[] args) {
		
		TreeMap<Integer, String> t1=new TreeMap<Integer, String>();
		
		t1.put(1,"SaGAr");
		t1.put(9,"Malhar");
		t1.put(4,"RAvi");
		t1.put(3,"Pankaj");
		t1.put(0,"XYZ");
		
		
		System.out.println(t1);
	}

}
