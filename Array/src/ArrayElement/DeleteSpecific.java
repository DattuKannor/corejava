package ArrayElement;

public class DeleteSpecific {
	public static void main(String[] args) {
		int a[]= {10,90,20,8,30,40};
		
		int delete=20;
		int cnt=0;
	  for (int i = 0; i < a.length-1; i++) 
	  {
		if(a[i]==delete)
		{
			int t=a[i];
			a[i]=a[i+1];
			a[i+1]=t;
			
			
			
		}
	
		 
}
	  
	 
	 
	  
	  
	  for (int i = 0; i < a.length-1; i++) {
		System.out.print(a[i]+" ");
	}
	}

}
