
public class Pattern15 {
//	12345
//	2345
//	3 4 5
//	45
//	5
//	45
//	3 4 5
//	2345
//	12345

	public static void main(String[] args) {
		int s=1,n=6;
		for(char i='A';i<='G';i++)
		{
			System.out.print(i);
		}
		
		for(char i='F';i>='A';i--)
		{
			System.out.print(i);
		}
		System.out.println();
		
		for(int i=1;i<=5;i++)
		{
			char ch='A';
			
			for(int j=1 ;j<=n;j++)
			{
				System.out.print(ch);
				ch++;
			}
			//System.out.println();
			for(int k=1;k<=s;k++)
			{
				System.out.print(" ");
			}
			for(int m=1;m<=n
			;m++)
			{
				ch--;
				System.out.print(ch);
				
				
			}
			System.out.println();
			s=s+2;
			n--;
		}
		//System.out.println();
				
			}
}
