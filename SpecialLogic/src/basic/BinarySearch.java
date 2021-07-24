package basic;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter "+size +" Elements..");
		
		
		for (int i = 0; i <a.length; i++) {
		a[i]=sc.nextInt();
		
		}
		
		System.out.println("Enter serch Element");
		int search=sc.nextInt();
		int cnt=0;
		
		
		int l=0;
		int h=a.length-1;
		int mid=(l+h)/2;
		
		
		
		while(l<=h)
		{
		if(a[mid]==search)
		{
			System.out.println("Element found at position "+mid);
			break;
			
		}
		else if(a[mid]<search)
		{
			l=mid+1;
		}
		else
		{
			h=mid-1;
		}
		
		mid=(h+l)/2;
		
		
		}
	}

}
