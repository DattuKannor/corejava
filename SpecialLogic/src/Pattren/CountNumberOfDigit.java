package Pattren;

public class CountNumberOfDigit {
	
	public static void main(String[] args) {
		
		//Display all elements between 400 to 500 (both numbers excluded) 
		//ending with seven. {Hint: output-407,417,427….}
		int n=400;
		
	int cnt=0;
		while(n<=500)
		{
		
			if(n%10==7)
			{
				System.out.println(n);
			}
		n++;
			
		}
		
		System.out.println(cnt);
	}

}
