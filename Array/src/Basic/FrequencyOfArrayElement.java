package Basic;

public class FrequencyOfArrayElement {
	public static void main(String[] args) {
		
		int cnt;
		int a[]= {10,4,5,4,5,10,11,23,4};
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----------\n");
		 for (int i = 0; i < a.length; i++) {
			 
			 cnt=1;
			for (int j = i+1; j < a.length; j++) {
				
				
				if(a[i]==a[j])
				{
					cnt++;
					a[j]=0;
				}
				
			}
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					
			if(a[i]!=0)
			{
			System.out.println(a[i] +" ----> "+cnt);
			}
		}
	}

}
