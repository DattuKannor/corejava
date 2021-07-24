package ArrayList.HW;

import java.util.ArrayList;
import java.util.Collections;

public class HW3 {
	//Write a Java program of swap two elements in an array list.
	public static void main(String[] args) {
		
	
	ArrayList<Object> a1=new ArrayList<Object>();

	a1.add("YELLO");
	a1.add(1);
	a1.add("BLACK");
	a1.add(6);
	a1.add(9.0f);
	a1.add(true);
	a1.add(null);
	
	Collections.swap(a1, 0, 5);
	System.out.println(a1);
	}


}
