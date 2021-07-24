package Basic;

import java.util.Scanner;

public class H_W2_2 {
	
	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     
	     System.out.println("Enter Size of array");
	     int size=sc.nextInt();
	     
     
		
	     int cnt=0;
	     int a[]=new int[size];
	    System.out.println("Enter "+size +"element");
	    
	    for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
	    
	    
	    System.out.println("Enter Number");
	     
	     int n=sc.nextInt();
	
	    
	     for (int i = 0; i < a.length; i++)
	     {
			a[i]=sc.nextInt();
			
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

