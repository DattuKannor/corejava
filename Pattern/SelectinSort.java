package ArrayElement;

public class SelectinSort {

	public static void main(String[] args) {
		
		int a[]= {30,45,7,3,1};
		int t;
		int min;
		
		
		for (int i = 0; i < a.length; i++) {
			 min=i;
			   
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[min]>a[j])
				{
					min =j;
				}
				t=a[i];
				a[i]=a[min];
				a[min]=t;
			}
			
			
		}
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+" ");
		}
	}
}
