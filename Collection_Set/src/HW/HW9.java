package HW;

import java.util.TreeSet;

public class HW9 {
	//9) Write a Java program to get the element in a tree set which is 
	//greater than or equal to the given element
	
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		
		
		t1.add(88);
		t1.add(9);
		t1.add(8);
		t1.add(4);
		t1.add(5);
		t1.add(6);
		t1.add(1);
		
	
		System.out.println(t1.higher(0));
		}
}



