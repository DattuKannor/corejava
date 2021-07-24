package TreeMApDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
	public static void main(String[] args) {
		
		TreeMap <Integer,String> t1=new TreeMap<Integer, String>();
		
		t1.put(1,"SAGAR");
		
		t1.put(4,"RK");
		t1.put(5,"Dk");
		t1.put(8,"PK");
		
		//	Collection r=new Collection(); 
			
		
      //Set s=new HashSet(t1.entrySet());
			
		Set s=t1.entrySet();
		
		Iterator i=s.iterator();
		while (i.hasNext())
		{
			Map.Entry e=(Map.Entry) i.next();
			System.out.println(e.getKey()  +"  :  "+e.getValue());
			
		}
		
		
}
				
			
		
		
		
		
		
	

}
