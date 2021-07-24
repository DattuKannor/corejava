package ArrayElement;

public class EvenOddArray {
	public static void main(String[] args) {
		
		
		//****  Feke Program
		int a[]= {10,13,14,15,17,20};
		
		System.out.print("EVEN ARRAY [");
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==0)
			{
				System.out.print(a[i]+" ");
			}
			
			
		}
		System.out.print("]");
		
		System.out.print("\n\nODD ARRAY [");
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%2==1)
			{
				System.out.print(a[i]+" ");
			}
			
		}
		System.out.print("]");
	}

}
