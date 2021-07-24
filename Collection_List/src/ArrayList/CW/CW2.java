package ArrayList.CW;

import java.util.ArrayList;
import java.util.Iterator;

public class CW2 {
	public static void main(String[] args) {
		ArrayList<Object> a1=new ArrayList<Object>();
		
		a1.add("YELLO");
		a1.add(1);
		a1.add("BLACK");
		a1.add(6);
		a1.add(9.0f);
		a1.add(true);
		a1.add(null);
		
		
		
		
		
		Iterator<Object> i=a1.iterator();
		
		while (i.hasNext())
		{
			
			System.out.println(i.next());
		}
	}

}
