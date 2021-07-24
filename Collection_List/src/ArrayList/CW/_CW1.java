package ArrayList.CW;

import java.util.ArrayList;
import java.util.Iterator;


public class _CW1 
{
//	Write a Java program to create a new array list,
//	add some colors (string) and print out the collection
	
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();
		
		a1.add("YELLO");
		a1.add("PINK");
		a1.add("BLACK");
		a1.add("WHITE");
		a1.add("REG");
		a1.add("GREEN");
		
		
		//    Using toString
		//System.out.println(a1);  
		
		
		//*  USING for loop
//		for (int i = 0; i <a1.size(); i++) 
//		{
//			System.out.println(a1.get(i));
//		}
		
		
		Iterator i=a1.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
}
