package ArrayList.HW;

import java.util.ArrayList;
import java.util.Collections;

public class HW2 {
	//Write a Java program to compare two array lists
	
	public static void main(String[] args) {
		
		ArrayList<Object> a1=new ArrayList<Object>();

		a1.add("YELLO");
		a1.add(1);
		a1.add("BLACK");
		a1.add(6);
		a1.add(9.0f);
		a1.add(true);
		a1.add(null);
	
		
		ArrayList<Object> a2=new ArrayList<Object>();

		a2.add("YELLO");
		a2.add(1);
		a2.add("BLACK");
		a2.add(0);
		a2.add(9.0f);
		a2.add(true);
		a2.add(null);
		
	System.out.println("Equal or Not :"+a1.equals(a2));
	
		
		
	}

}
