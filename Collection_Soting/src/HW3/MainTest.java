package HW3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainTest implements Comparator<Employee>{
	
	public static void main(String[] args) {
		Employee e=new Employee(1,"Malhar",51000);
		Employee e1=new Employee(2,"Jay",21000);
		
		Employee e2=new Employee(3,"Datta", 41000);
		Employee e3=new Employee(4, "baba", 31000);
		
		
		
		ArrayList<Employee> a=new ArrayList<Employee>();
		a.add(e);
		a.add(e);
		a.add(e2);
		a.add(e3);
		
		
		System.out.println(a);
		System.out.println("----------");
		Collections.sort(a,(a1,a2)-> 
		{ return a1.getSname().compareTo(a2.getSname());
		}
		
		);
		
		System.out.println(a);
		
		
	}

}
