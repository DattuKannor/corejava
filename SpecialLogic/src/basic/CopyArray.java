package basic;

public class CopyArray {
	public static void main(String[] args) {
		int a[]= {1,2,77,4,5};
		
		
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				a[j]=a[j]-a[i];
				a[i]=a[i]+a[j];
				a[j]=a[i]-a[j];
				
			}
			
			
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
