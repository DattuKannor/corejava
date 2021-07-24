package ArrayList.HW;

import java.util.ArrayList;

public class HW5 {
//	 Write a Java program to clone an array 
//	 list to another array list.
	public static void main(String[] args) {
		ArrayList a2 = new ArrayList();

		a2.add(1);
		a2.add(2);
		a2.add(3);
		a2.add(4);
		a2.add(5);

		ArrayList a1 = new ArrayList();
		a1 = (ArrayList) a2.clone();

		System.out.println(a1);
	}

}
