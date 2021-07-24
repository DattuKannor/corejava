package Pattren;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		//Find if given number is prime or not.
		
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Number");
//        int n=sc.nextInt();
        
        
     
        for (int i = 2; i <=100; i++) {
			
		
        
        int cnt=0;
        for (int j = 2; j <i; j++) {
        	
        	
        	if(i%j==0)
        	{
        		cnt++;
        	}
			
		}
       // System.out.println(cnt);
        if(cnt==0)
        {
        	System.out.println("Prime :" +i);
        	
        }
        }
		
       
	}

}
