package Basic;

public class SmallNumber {

	public static void main(String[] args) {
		
		int a[]= {2,12,1001,10,4,11};
		
		
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			
			 max=i;
			if(a[i]>max)
			{
				max=a[i];
				//max=i;
				
				
			}
			
		}
		
		System.out.println("MAX :"+max);
		
		
		
	}

}
