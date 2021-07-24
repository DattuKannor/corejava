package Basic;

public class Demo2 {
	public static void main(String[] args) {
		//int n=7;
		int cnt;
		for (int n = 2; n <100; n++) {
			cnt=0;
		
		for (int j = 2; j < n; j++) {
			if(n%j==0)
			{
				cnt++;
			}
			
		}

		if(cnt==0)
		{
		System.out.println("PRIME"+n);	
		}
		
		
		
	}

}}
