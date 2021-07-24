package ArrayList.CW;

import java.util.ArrayList;
import java.util.Collections;


public class Cw9 {
	//Write a Java program to reverse elements in a array list.
	
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();

		a1.add("YELLO");
		a1.add(1);
		a1.add("BLACK");
		a1.add(6);
		a1.add(9.0f);
		a1.add(true);
		a1.add(null);
	
		Collections.reverse(a1);
		
	
	System.out.println(a1);
	}


}
