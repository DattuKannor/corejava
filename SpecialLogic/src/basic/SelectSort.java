package basic;

public class SelectSort {
public static void main(String[] args) {
	int a[]= {25,15,1,5,3};
	
	int min;
	for (int i = 0; i < a.length; i++) {
		
		min=i;
		for (int j = i+1; j < a.length; j++) {
			
			if(a[min]>a[j])
			{
				min=j;
			}
			
		}
		
		int t=a[i];
		a[i]=a[min];
		a[min]=t;
		
	}
	
	
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
		
	}
}
}
