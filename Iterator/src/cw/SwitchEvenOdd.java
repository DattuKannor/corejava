package cw;

import java.util.Scanner;

public class SwitchEvenOdd {
	public static void main(String[] args) {
		System.out.println("1.Even ");
		System.out.println("2.Odd ");
		System.out.println("3.Prime ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice");
		int ch = sc.nextInt();

		int i = 1;

		switch (ch) {
		case 1:

			// int i = 1;
			while (i <= 100) {
				// System.out.println("hi");
				if (i % 2 == 0) {

					System.out.println(" Even  :" + i);

				}
				i++;
			}
			break;

		case 2:
			int a = 1;
			while (a <= 100) {
				if (a % 2 == 1) {

					System.out.println(" Odd  :" + a);

				}
				a++;
			}

			break;
		case 3:
			for(int k=1;k<=100;k++)
			{
				
				int count =1;
				int n=100;
				//Scanner sc=new Scanner(System.in);
				//System.out.println("Enter any Number");
				//int n=sc.nextInt();
				
				for( i=3;i<=n;i++)
				{
					if(n%i==0)
					{
						count++;
						
					}
				}//inner for
				
				
				if(count<=2)
				{
					System.out.println("PRIME NUMBER");
				}
				
	
			}//outer for
			break;
//		default:
//			System.out.println("enter vaild choice between 1 to 3");
	}
	}
}


