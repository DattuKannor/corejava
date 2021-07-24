 package ArrayElement;


public class LeaderArray {
	
	public static void main(String[] args) {
		
		
		int a[]= {98,78,54,99,21,47};
		
		for (int i = 0; i < a.length; i++) {
			int cnt=0;
			for (int j = 0; j < a.length; j++) {
				
				if(a[i]<a[j])
				{
					cnt++;
					break;
				}
				
			}
			if(cnt==0)
			{
				System.out.println(a[i]);
			}
			
		}
		
		
	}	

}
