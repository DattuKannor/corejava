package ArrayList.CW;

import java.util.ArrayList;
import java.util.Iterator;

public class CW4 {
//	Write a Java program to retrieve an element (at a specified index)
	//from a given array list.
	
	
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();

		a1.add("YELLO");
		a1.add(1);
		a1.add("BLACK");
		a1.add(6);
		a1.add(9.0f);
		a1.add(true);
		a1.add(null);
	
		//Insert an element into first position
		
		System.out.println("4 indext Element :"+a1.get(4));
		
		
		
	
	}



}
