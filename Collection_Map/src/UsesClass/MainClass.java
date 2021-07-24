package UsesClass;

import java.util.HashMap;

public class MainClass {
	
	public static void main(String[] args) {
		
		HashMap<Bus, Drive> d1=new HashMap<Bus, Drive>();
		Bus b=new Bus();
		Drive d=new Drive();
		
		b.setBus_id(011);
		d.setDriver("SK");
		
		d1.put(b,d);
		//d1.put(new Bus(111), new Drive("School_Bus"));
		
		System.out.println(d1);
	}

}
