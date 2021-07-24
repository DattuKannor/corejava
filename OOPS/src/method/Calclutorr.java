package method;

import java.util.Scanner;

public class Calclutorr {

	static Scanner sc=new Scanner(System.in);
	int a,b;
	int calculateSum(int num1,int num2)
	{
		return num1+num2;
		
	}
	
	int calculateDiff(int num1,int num2)
	{
		this.a=num1;
		this.b=num2;
		
		if(a>b)
		{
			int  c=a-b;
			return c;
		}
		else
		{
			int  c=b-a;
			return c;
		}
		
		
	}
	
	public static void main(String[] args) {
		Calclutorr cc=new Calclutorr();
		System.out.println("Enter First NUmber");
		int a=sc.nextInt();
		
		System.out.println("Enter Second NUmber");
		int b=sc.nextInt();
		
		System.out.println("SUM OF TWO NUMBER "+cc.calculateSum(a, b));
		System.out.println("DIIFERENCE BETWEEN TWO NUMBER "+cc.calculateDiff(a, b));
		
		
		
		}
}
