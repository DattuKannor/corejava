package Basic;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter number check its Kaprekar or not");
//		int n=sc.nextInt();
		int n=9;
		int t1=n*n;
		int t2=t1;
		int cnt=0;
		
		while(t1>0)
		{
			t1=t1/10;
			cnt++;
			
		}
		
		System.out.println(cnt);
		System.out.println(t1);
		int a1,a2;
		if(cnt==2)
		{
		a1=t2% (int)Math.pow(10,(cnt-1));
		a2=t2 /(int)Math.pow(10,(cnt-1));
		}
		else
		{
			a1=t2% (int)Math.pow(10,(cnt-2));
			a2=t2 /(int)Math.pow(10,(cnt-2));
			
		}
		
		if((a1+a2)==n)
		{
			System.out.println(n+" is Kaprekar");
		}
		else
		{
			System.out.println(n+" Not kaprekar");
		}
	}
    }
