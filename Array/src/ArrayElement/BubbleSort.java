package ArrayElement;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= {10,30,40,60};
		
		int b[]=new int[4];
		
		
		System.out.println("Origenal Array");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		for (int i = 0; i < a.length; i++) {
			b[b.length-1-i]=a[i];
		}
		
		
		System.out.println("\n-----------------------"	+ "\nReverse Array");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
