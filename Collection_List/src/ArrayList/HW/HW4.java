package ArrayList.HW;

import java.util.ArrayList;
import java.util.Collections;

public class HW4 {
	//Write a Java program to join two array lists.
	
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

		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);
		a1.addAll(a2);
		System.out.println(a1);
       
	}

}
