package cw;

public class PinkYellow {
//	Write a Java program which prints 33 to 999. The numbers should be displayed as:
//		a) For multiples of 3 print "PINK" instead of the number
//		b) For the multiples of five print "YELLOW".
//		c) For numbers which are multiples of both three and five print "PINK & YELLOW".
//		Also print count of how many times “PINK” was printed, “YELLOW” was printed and “PINK & YELLOW “was printed. (Feb Monthly)
	public static void main(String[] args) {
		int c1=1,c2=1,c3=1;
		
		for(int i=33;i<=99;i++)
		{
			if(i%3==0)
			{
				System.out.println("PINK  ");
				c1++;
			}
			else if(i%5==0)
			{
				System.out.println("Yello  ");
				c2++;
			}
			else if(i%3==0 && i%5==0)
			{
				System.out.println("PINK & Yellow  ");
				c3++;
			}
			 else
			 {
				 System.out.println(" "+i);
			 }
		}
		
		System.out.println("PINK IS  REPEATED "+c1);
		 System.out.println("YELLO IS  REPEATED "+c2 );
		 System.out.println("YELLO & PINK IS REPEATED "+c3);
		 
		 System.out.println("Total Count "+(c1+c2+c3));

		

		
	}
	
}
