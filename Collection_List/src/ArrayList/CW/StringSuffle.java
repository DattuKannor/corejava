package ArrayList.CW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StringSuffle {
	public static void main(String[] args) 
	{
		String s1="India";
		char c[]=s1.toCharArray();
		ArrayList a1=new ArrayList();	
		
		
		for (int i = 0; i < c.length; i++) {
			a1.add(c[i]);
		}
		
		Collections.shuffle(a1);
		
		Iterator i=a1.iterator();
		
		while(i.hasNext())
		{
			System.out.print(i.next());
		}
		
	
	}

}
