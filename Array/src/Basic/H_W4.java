package Basic;

import java.util.Scanner;

public class H_W4 {
	public static void main(String[] args) {
	
		//Write a Java program to remove a specific
		
//		Scanner sc=new Scanner(System.in);
//	     System.out.println("Enter Number");
//	     
//	     int n=sc.nextInt();
	     
		int a[]= {80,20,30,90,50,60};
		int x;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]<a[i])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
			}
		
		}
//		

		int n=a.length-2;
		System.out.println("largest Second in given array"+a[n]);
		
		
		
		
	}

}
