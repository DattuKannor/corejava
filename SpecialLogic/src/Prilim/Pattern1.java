package Prilim;

public class Pattern1 {
	
	
//      1 
//	   1 1 
//	  1 2 1 
//	 1 3 3 1 
//	1 4 6 4 1 
//	
//	
	public static void main(String[] args) {
		
		
		for (int i = 1; i <=5; i++) 
		{
			for (int j = 4; j>=i; j--) 
			{
				System.out.print(" ");
			}
			for (int j = 1; j>=1; j--) 
			{
				System.out.print(1+" ");
			}
			
			for (int j = i; j >=2; j--) 
			{
				System.out.print(i+" ");
			}
			
			for (int j = 1; j <=1; j++) {
				System.out.print(1+" "
						+ "");
			}
			
			
			System.out.println();
		}
		
		
		
	}

}
