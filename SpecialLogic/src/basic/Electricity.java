package basic;

import java.util.Scanner;

public class Electricity {
//	Write a program to input electricity unit charges and 
//	calculate total electricity bill according to
//	the given condition:
//			For first 50 units Rs. 0.50/unit
//			For next 100 units Rs.0.75/unit
//			For next 100 units Rs. 1.20/unit
//			For unit above 250 Rs.1.50/unit
//	An additional surcharge of 20% is added to the bill

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double bill;
		System.out.println("Enter nput electricity unit charges");
		double unit=sc.nextDouble();
		
		if(unit<50)
		{
		  bill=unit*0.50;	
		}
		else if(unit<150)
		{
			//bill=(50*0.5)+((150-unit)*0.75);
			bill=(50*0.50)+((unit-50)*0.75);
		}
		else if(unit<250)
		{
			//bill=(50*0.5)+(150*0.75)+((250-unit)*1.20);
			bill=((0.50*50)+(0.75*150)+((unit-150)*1.20));
		}
		else
		{
			bill=((0.50*50)+(0.75*150)+((unit-150)*1.20)+(1.50*(unit-250)));
		}
		
		
		double t_bill=bill+(bill*0.2);
		System.out.println("Total Bill :"+t_bill);
	}

}
