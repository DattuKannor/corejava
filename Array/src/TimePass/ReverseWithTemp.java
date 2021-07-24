package TimePass;

public class ReverseWithTemp {
	//6) WAP to print reverse of an array using temp variable.
	public static void main(String[] args) {
		
		int a[]= {10,30,50,70,89,76,67,43,90};
		int temp;
		
		
		System.out.println("ORIGNAL ARRAY");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		
		
for (int i = 0; i < a.length; i++) {
			
		for (int j = i+1; j < a.length; j++) {
			
			
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
		}
		
		System.out.println("\n\nREVERSE ARRAY");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
