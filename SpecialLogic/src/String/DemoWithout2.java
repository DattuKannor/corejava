package String;

import java.util.Scanner;

public class DemoWithout2 {
	
	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int a[]= new int[n];
		
		int u_length=n;
		char ch=0;
		int cnt=0;
		System.out.println("Enter "+ n+" Element");
		
		try {
		for (int i = 0; i <cnt+1; i++) {
			
		  a[i]=sc.nextInt();
			
		  cnt++;
			if(cnt==u_length)
			{
				break;
			}
			
		}
		
		
		System.out.println("lenght :"+cnt);
	
	int lef[]=new int[cnt];
	int right[]=new int[cnt];
	int pro[]=new int[cnt];
	System.out.println("lenght :"+cnt);
	lef[0]=1;
	
	right[n-1]=1;
	
	for ( int i = 1; i <n; i++) {
		lef[i]=a[i-1]*lef[i-1];
		
		
	}
	
	System.out.println("a_length:"+cnt);
	for (int i = 0; i <cnt-1; i++) {
		System.out.println(lef[i]);
	}
	
//	for (int i = a_lenth-2; i>=0; i--) {
//		System.out.println(right[i]);
//	}
	
	
		
		}
		catch (Exception e) {
			System.out.println(" EROOR ");
		}

		
	}

}
