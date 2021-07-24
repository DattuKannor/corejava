package ArrayElement;

import java.util.Scanner;

public class CalAverage {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size=sc.nextInt();
	int a[]=new int[size];
	int sum=0;
	System.out.println("Enter the "+size+" Element");
	
	for (int i = 0; i < a.length; i++) {
		
		a[i]=sc.nextInt();
		
	}
	System.out.println("Total element in array "+a.length);
	
	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
		
	}

	
     System.out.println("SUM OF TOTAL ARRAY :"+sum);
     System.out.println("AVERAGE OF ARRAY   :"+(sum/a.length));
	
	}

}
