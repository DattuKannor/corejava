package HW;

import java.util.ArrayList;
import java.util.Collections;

public class HW2 {
	public static void main(String[] args) {
		int a=1;
		int b=3;
		int c=0;
		int d=-9;
		
		ArrayList a1=new ArrayList();
		a1.add(a);
		a1.add(b);
		a1.add(c);
		a1.add(d);
		
		Collections.sort(a1);
		System.out.println(a1);
	}

}
