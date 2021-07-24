package ArrayElement;

public class DeleteSpecificElement {
	public static void main(String[] args) {
		int a[]={10,20,50,40,33};
		int delete=10;
		int cnt=0;
		
		
		
		
		for (int i = 0; i < a.length; i++) {
			
			if(delete==a[i])
			{
				for (int j = i; j < a.length-1; j++) {
					a[j]=a[j+1];
					
				}
				cnt++;
				break;
				
				
			}
			
		}
		
		if(cnt==0)
		{
			System.out.println("Element not found re ...");
		}
		else
		{
			
			System.out.println("Deleted sucessfully");
			System.out.print("[");
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("]");
		}
	}

}
