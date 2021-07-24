package cw;

public class PrimeNumber {
	public static void main(String[] args) {
		int cnt=1;
		for(int i=2;i<=50;i++)
		{
		cnt=1;
		  for(int j=2;j<i/2;j++)
		  {
			  
			  if(i%j==0)
			  {
				  cnt++;
			  }
		  }
		  
		  if(cnt==1)
		  {
			  System.out.println(i);
			  
		  }
		}
	}

}
