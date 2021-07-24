package HW1;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HW7 {
	//Write a Java program to get a collection view of the values 
	//contained in this map.
	public static void main(String[] args) 
	{
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		
		h1.put(1,"SAGAR");
		h1.put(8,"DAttu");
		h1.put(2,"Ram");
		h1.put(5,"sham");
		
		
		Set s=h1.entrySet();
		
		Iterator i=s.iterator();
		
		while (i.hasNext())
		{
			Map.Entry e=(Map.Entry) i.next();
			
			System.out.println(e.getValue());
		}
		
		
		
	}
}
