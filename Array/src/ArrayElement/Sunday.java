package ArrayElement;

import java.util.Scanner;

public class Sunday {
	
	public static void main(String[] args) {
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Size");
		int size=sc.nextInt();
		int a[]= new int[size];
		
		System.out.println("Enter "+size +" Element");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(a[i]==a[j])
				{
					a[j]=0;
					
				}
				
				if(a[j]!=0 && a[i]!=0)
				{
					System.out.println("("+a[i]+","+a[j]+")");
					System.out.println("("+a[j]+","+a[i]+")");
					cnt=cnt+2;
				}
			}
			
			if(a[i]!=0)
			{
				System.out.println("("+a[i]+","+a[i]+")");
				cnt++;
			}
		}
		
		System.out.println("No of Pair "
				+ ""+cnt);
//		if(cnt!=0)
//		{
//			for (int i = 0; i < a.length; i++) {
//				System.out.println(a[i]+" ");
//			}
//		}
	}

}
