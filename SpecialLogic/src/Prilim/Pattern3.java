package Prilim;

public class Pattern3 {
	
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
				chh--;
				System.out.print(chh);
				
			}
			if(i==2&&j==2) {
				System.out.print
				(ch1);
				ch++;
			}
			
			if((i+j)==6)
			{
				System.out.print
				
				("c");
			}
			else
			{
				System.out.print(" ");
			}
	}
		 
		 
		 
		 System.out.println();
		
	}
}


}
