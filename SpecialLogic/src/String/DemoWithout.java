package String;

import java.util.Scanner;

public class DemoWithout {

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
		
		int a_lenth=cnt;
		//System.out.println(a_lenth);
	
	
		for (int i = 0; i <=cnt; i++) {
			
			System.out.print(a[i]);
			cnt++;
			//System.out.print("ppp");
			
			if(cnt==u_length)
			{
				break;
			}
		}
		}
		catch (Exception e) {
			System.out.println(" ");
		}
	}
}
