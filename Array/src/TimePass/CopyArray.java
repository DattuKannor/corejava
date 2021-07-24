package TimePass;

public class CopyArray {
	public static void main(String[] args) {
		int a[]= { 1,2,5,3,4};
		int b[]=new int[5];
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
	}

}
