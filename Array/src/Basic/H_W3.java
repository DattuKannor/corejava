package Basic;

import java.util.Scanner;

public class H_W3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
	     
	     int n=sc.nextInt();
		int b=1;
		int a[]= {10,20,30,40,50,60,70,80,90};
		
		for(int i=0;i<a.length;i++)
		{
			if(n==a[i])
			{
				b=2;
				System.out.println(a[i]+" element found at location "+i);
			}
		}
		
		if(b==1)
		{
			System.out.println("not available in array");
		}
	}

}
