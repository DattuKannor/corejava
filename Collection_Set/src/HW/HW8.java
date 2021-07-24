package HW;

import java.util.Iterator;
import java.util.TreeSet;

public class HW8 {
	//8) Write a Java program to find the numbers
	//less than 7 in a tree set.
	
	
	public static void main(String[] args) {
		TreeSet t1=new TreeSet();
		
		
		t1.add(88);
		t1.add(9);
		t1.add(8);
		t1.add(4);
		t1.add(5);
		t1.add(6);
		t1.add(1);
		
		Iterator i=t1.iterator();
		
//		while(i.hasNext())
//		{
//			Object a=i.next();
//			if((int)a>7)
//			{
//				System.out.println(i.next());
//			}
//		}
		
		
		for (int j =0; j<7;j++) {
			
		
			if(t1.contains(j))
		System.out.println(t1.ceiling(j));
		}
}

}
