package ArrayElement;

public class CopyArray {
	
	public static void main(String[] args) {
		  int a[]= {10,4,34,9};
		  
		  int b[]=new int[4];
		  
		 for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		 
		 for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}

}
