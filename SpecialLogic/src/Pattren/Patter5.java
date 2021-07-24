package Pattren;

public class Patter5 {
//	*
//	***
//	*****
//	*******
//	*********
//	*******
//	*****
//	***
//	*
	
	public static void main(String[] args) {
		
	int n=1;
	
	for (int i = 1; i <=5; i++) 
	{
		for (int j = 1; j <=n; j++) 
		{
			System.out.print("*");
		}
	 n=n+2;
		System.out.println();
	}
	
	int nn=7;
	for (int i = 6; i>=1; i--)
	{
		for (int j = 1; j <=nn; j++) {
			 System.out.print("*");	
			
		}
		
		nn=nn-2;
		System.out.println();
	 
	}
		
	}
}
