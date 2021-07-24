package basic;

public class ArrayFrequecy {

	public static void main(String[] args) {
		
		int a[]= {1,5,4,1,1,5,6};
		int cnt;
	
		int min;
		for (int i = 0; i < a.length; i++) {
			
			min=i;
			for (int j = i+1; j < a.length; j++) {
				
				if(a[j]<a[min])
				{
					min=j;
				}
				
			}
			
			int t=a[i];
			a[i]=a[min];
			a[min]=t;

		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
	}
		
		
	}
	
//}
