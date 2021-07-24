package Basic;

import java.util.Scanner;

public class H_W2 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Number");
     
     int n=sc.nextInt();
     
	
		
     int a[]=new int[] {10,20,30,40,50};
    
     int cnt=0;
     for (int i = 0; i < a.length; i++)
     {
		//System.out.println(a[i]);
		
		if(n==a[i])
		{
			cnt++;
			System.out.println(a[i]+" Element fount at "+i);
			break;
		}
		
		
		
	}
     if(cnt==0)
		{
			System.out.println("Elemnt not fount");
		}
     

	}

	
}
