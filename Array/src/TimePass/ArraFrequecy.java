package TimePass;

public class ArraFrequecy {
	
	public static void main(String[] args) {
		
		
		int a[]= {1,5,4,1,1};
		int cnt;
		
		
		for (int i = 0; i < a.length; i++) {
			cnt=1;
			for (int j = i+1; j < a.length; j++) {
				if(a[j]==a[i])
				{
					a[j]=0;
					cnt++;
				}
				
			}
			
		
			if(a[i]!=0)
			{
				System.out.println(a[i]+"-- --reated->"+cnt);
			}
		}
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]+" ");
//		}
		
		
	}

}
