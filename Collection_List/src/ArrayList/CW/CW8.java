package ArrayList.CW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CW8 {
	//Write a Java program to sort a given array list.
	
	public static void main(String[] args) 
	{
	
		ArrayList<Integer> a1=new ArrayList();

		a1.add(66);
		a1.add(9);
		a1.add(44);
		a1.add(6);
		a1.add(99);
		a1.add(88);
		a1.add(767);
	
	Collections.sort(a1);
	
	System.out.println(a1);
	}
	}

