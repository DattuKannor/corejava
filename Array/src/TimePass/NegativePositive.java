package TimePass;

public class NegativePositive {
	public static void main(String[] args) {
		int a[]= {-1,4,6,9,3,-2,-4};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
			}
			
			
		}
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
