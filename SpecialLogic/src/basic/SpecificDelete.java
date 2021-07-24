package basic;

public class SpecificDelete {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6,7,8};
		
		int delete=5;
		int cnt=0;
		for (int i = 0; i <a.length; i++) {
			if(a[i]==delete)
			{
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];	
				}
				cnt++;
				break;
				
			}
			
		}
		
		if(cnt!=0)
		{
		System.out.println("Delete Succesffully.....");	
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
			
		}
			
			
		
	}
}
