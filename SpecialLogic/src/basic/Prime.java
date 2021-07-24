package basic;

public class Prime {
	
	public static void main(String[] args) {
	int n=7;
	
	for (int i = 2; i < 100; i++) {
		
	
	int cnt=0;
	for (int j = 2; j < i; j++) {
		
		if(i%j==0)
		{
			cnt++;
		}
	}
	
	if(cnt==0)
	{
		System.out.println(i+"PRIME");
	}
	}	//System.out.println("jghnhjhg");
	}

}
