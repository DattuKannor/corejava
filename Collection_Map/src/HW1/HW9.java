package HW1;

import java.util.TreeMap;

public class HW9 {
	//9) Write a Java program to get all keys from the given a Tree Map.
	public static void main(String[] args) {
		
			
			TreeMap<Integer, String> t1=new TreeMap<Integer, String>();
			
			t1.put(1,"SaGAr");
			t1.put(9,"Malhar");
			t1.put(4,"RAvi");
			t1.put(3,"Pankaj");
			t1.put(0,"XYZ");
			
			
			System.out.println(t1.keySet());
		}

	}



