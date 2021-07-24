package basic;



public class PrimeNumber 
{

	
	
	public static void main(String[] args) {
		int n=7;
		int cnt1=0;
		for (int j = 2; j <=100; j++)
		{
			int cnt=0;
			for (int i = 2; i <=j-1; i++) {
				if(j%i==0)
				{
					cnt++;
				}
				
			}
			if(cnt==0)
			{
				System.out.println("Prime :"+j);
				cnt1++;
			}
			
		}
		System.out.println("Total Prime No :"+cnt1);
		
		
		
	}
	
	
}
