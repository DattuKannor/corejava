package ArrayElement;

public class NegativePositive {
	public static void main(String[] args) {
		int a[]= {7,5,-3,-1,8};
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int i = a.length-1; i >=0; i--) {
			System.out.print(a[i]+" ");
		}
		
		
	}
}
