package Prilim;

public class Pattern2 {
	 public static void main(String[] args) {
		        
		 
		
		 char ch='X';
		 char chh='X';
		 char ch1='A';
		 for (int i = 1; i <=3; i++) {
			 
			 for (int j = 1; j<=5 ;j++)
			 {
				if((i+j)==4)
				{
	               System.out.print(ch);
	               ch++;
				}
				if((j-i)==2)
				{
					System.out.print(chh);
		               chh--;
					}
				
				else
				{
					System.out.print(" ");
				}
				
				
//					else
//					{
//						System.out.print(" ");
//					}
						
				
			}
			 
			 System.out.println();
			
		}
	}

}
