package ArrayElement;

public class SwapArrayWihountTemp {
	public static void main(String[] args) {
		int temp;
		int a[]= { 20,30,3,5};
		for (int i = 0; i < args.length; i++) {
			for (int j = i+1; j < args.length-1; j++) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			
			
				
				
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" "
					+ "");
		}
	}

}
