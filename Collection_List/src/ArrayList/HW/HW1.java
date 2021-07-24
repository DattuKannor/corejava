package ArrayList.HW;

import java.util.ArrayList;

public class HW1 {
//	Write a Java program to extract
//	a portion of a array list.
	
	public static void main(String[] args) {
		
		ArrayList<Object> a1=new ArrayList<Object>();

		a1.add("YELLO");
		a1.add(1);
		a1.add("BLACK");
		a1.add(6);
		a1.add(9.0f);
		a1.add(true);
		a1.add(null);
	
		for (int i = 0; i <a1.size(); i++) 
		{
			System.out.println(a1.get(i));
		}
		
	}

}
