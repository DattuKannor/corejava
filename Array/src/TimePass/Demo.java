package TimePass;

import java.util.Scanner;

public class Demo {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		char c[]=s.toCharArray();
		
		char freq=c[1],freq1=0;
		System.out.println("Second most frequent character is:");
         for(int i=0;i<c.length;i++)
         {
        	 if(c[i]>freq)
        	 {
        		 freq1=freq;
        		 freq=c[i];
        	 }
        	 if((c[i]>freq1)&&(c[i]!=freq))
        	 {
        		 freq1=c[i];
        	 }
         }
         System.out.println(freq1);
	}



}
