package EmploSalDecending;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		
		Employee e[]=new Employee[3];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < e.length; i++) {
			System.out.println("Enter eid,name,sal");
			e[i]=new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
			
		}
		
		
		
//		for (int i = 0; i < e.length; i++) {
//			for (int j =i+1; j < e.length; j++) {
//				
//				if(e[i].getSal()<e[j].getSal())
//				{
//					Employee t	=e[i];
//					e[i]=e[j];
//					e[j]=t;
//				 
//				}
//				
//				
//				
//				
//			}
//			
//		}
		
		for (int j2 = 0; j2 < e.length; j2++) {
			if(e[j2].getSal()>=1000 && e[j2].getSal()<=5000)
			System.out.println(e[j2]);
		}
	}

}
