package HW1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class HW10 {
//10) Write a Java program to sort keys in Tree Map by using comparator.
public static void main(String[] args) {
		
		TreeMap<Integer, String> t1=new TreeMap<Integer, String>();
		
		t1.put(1,"SaGAr");
		t1.put(9,"Malhar");
		t1.put(4,"RAvi");
		t1.put(3,"Pankaj");
		t1.put(0,"XYZ");
		
		
		System.out.println(t1);
		
		ArrayList l1=new ArrayList(t1.keySet());
		
		System.out.println(l1);
		
		
		
		
		Collections.sort(l1, (o1,o2)->{
			
			if((Integer)o1<(Integer)o2)
			   {
				   return 1;
			   }
			   if((Integer)o1>(Integer)o2)
			   {
				   return -1;
			   }
			   else
			   {
				   return 0;
			   }

			
		

  }
		);
		
		
		
		
		
		
		
		System.out.println(l1);
		
		
		
	}
	
}
