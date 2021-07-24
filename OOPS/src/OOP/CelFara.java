
package OOP;

import java.util.Scanner;

public class CelFara {
	
	void cal(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in °Celsius :");
		double c=sc.nextDouble();
		double f=(c*(9/5))+32;
		
		System.out.println("°Fahrenheit:"+f);
		System.out.println("-------------------------");
	}
		
		
		void f()
		{
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter tempereture in °Fahrenheit");
		double ff=sc.nextDouble();
		double cc=(ff-32)*(5/9);
		
		System.out.println("°Celsius :"+cc);
		
	}

}
