package ArrayList.CW;

import java.util.ArrayList;

public class CW6 {
	//Write a Java program to remove the third element from a array list
	
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
	//a1.remove(3);
	a1.remove("black");
	System.out.println(a1);
	}
	

	
}
