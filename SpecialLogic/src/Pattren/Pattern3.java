package Pattren;

public class Pattern3 
{

//	ABCDEFGFEDCBA 
//	ABCDEF FEDCBA
//	ABCDE 	EDCBA
//	ABCD 	 DCBA
//	ABC 	  CBA
//	AB         BA
//	A           A
	
	public static void main(String[] args) {
		
		for (char i ='A';i<='G'; i++)
		{
			System.out.print(i);
		}
		for (char i ='F';i>='A'; i--)
		{
			System.out.print(i);
		}
		System.out.println();
		
		
		int n=6;
		int s=1;
		char ch='A';
		
		for (int i = 1; i <=6; i++)
		{
			
			for (int j = 1; j <=n; j++) 
			{
				System.out.print(ch);
				ch++;
			}
			for (int j = 1; j<=s ;j++) {
				System.out.print(" ");
				
				
			}
			for (int j = 1; j <=n; j++) {
				ch--;
				
				System.out.print
				(ch);
				
			}
			
			n--;
			s=s+2;
			
			System.out.println();
		}
	}
}
