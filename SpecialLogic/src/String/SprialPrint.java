package String;

import java.util.Scanner;

public class SprialPrint {
public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	int size1,size2;
	System.out.println("Enter row size");
	size1=sc.nextInt();
	
	System.out.println("Enter column size");
	size2=sc.nextInt();
	
	int a[][]=new int[size1][size2];
	
	for (int i = 0; i < size1; i++) 
	{
		for (int j = 0; j < size2; j++) {
			a[i][j]=sc.nextInt();
			
		}
	}
	
	
	
	
//		int a[][]= {
//				         {1,2,3,4},
//				         {12,13,14,5},
//				         {11,16,15,6},
//				         {10,9,8,7}
//				
//		          };
//		
		for (int i = 0; i <=0; i++) {
			for (int j = 0; j <size1; j++) {
				System.out.println(a[i][j]+"  ");
			}
			//
			System.out.println("  ");
		}
		
		
		for (int i = 1; i < size1; i++) {
			for (int j = 3; j <=3; j++) {
				System.out.print(a[i][j]);
				
				
			}
			System.out.println();
			
		}
		
		
		for (int i = 3; i <=3; i++) {
			for (int j = 2; j>=0; j--) {
				System.out.print(a[i][j]);
				System.out.println();
				
			}
		//	System.out.println();
			
		}
		
		
			
		for (int i = 2; i>=1; i--) {
			for (int j = 0; j <=0; j++) {
				System.out.println(a[i][j]);
				
			}
			
			
		}
		
		
		for (int i = 1; i <=1; i++) {
			for (int j = 1; j<=2; j++) {
				System.out.println(a[i][j]);
				
			}
			
		}
		
		for (int i = 2; i <=2; i++) {
			for (int j =2; j>=1; j--) {
				System.out.println(a[i][j]);
				
			}
			
		}
		
	}


}
