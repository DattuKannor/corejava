package Pattren;

public class Pattern2 {
//	12345
//	2345
//	345
//	45
//	5
//	45
//	345
//	2345
//	12345
	
	public static void main(String[] args) {
		for (int i = 1; i<=5; i++) 
		{
			for (int j = i; j<=5; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		
		for (int i =4; i>=1; i--) 
		{
			for (int j = i; j<=5; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}
