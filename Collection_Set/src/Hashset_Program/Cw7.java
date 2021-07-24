package Hashset_Program;

import java.util.HashSet;
import java.util.Iterator;

public class Cw7 
{
	//Write a Java program to convert a hash set to an array.
	
	
	public static void main(String[] args) {
		HashSet h1=new HashSet();
		
		
		
		
		h1.add(3);
		h1.add(7); //Homogeous 
		h1.add(9);//hetrogeous
		h1.add(10);
		
		int arra[]=new int[h1.size()];
		
		Iterator i=h1.iterator();
		
		while(i.hasNext())

		{
			for (int j = 0; j < arra.length; j++)
			{
				arra[j]=(int)(i.next());
			}
		}
		
		for (int j = 0; j < arra.length; j++) {
			System.out.println(arra[j]);
		}
		
		
		
		
		System.out.println("\n\n--Anather way using Method--");
		int a[]=new int[h1.size()];
		
		Object c[]=h1.toArray();
		
		for (int j = 0; j < c.length; j++) {
			System.out.println(c[j]);
		}
		
		
		
	 }
	
	
	
	

}
