package CW1;

import java.util.HashMap;

public class CW1 {
	//Write a Java program to associate the specified value 
	//with the specified key in a HashMap.
	
	
	public static void main(String[] args) {
		HashMap<Integer, String> h1=new HashMap<Integer, String>();
		
		h1.put(1,"SAGAR");
		h1.put(8,"DAttu");
		h1.put(2,"KK");
		h1.put(5,"RK");
		
		
		h1.put(1,"MALHAR"); //Duplicate key Not allowed.
		h1.put(10,"MALHAR"); //Duplicate Value Allowed.
		h1.put(null,"XYZ"); //null key allowed only one
		h1.put(null,null);  //Multiple null value allowd
		  //Insertion order not privised.
		System.out.println(h1);
	}

}
