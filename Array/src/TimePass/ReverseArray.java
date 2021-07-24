package TimePass;

public class ReverseArray {
	public static void main(String[] args) {
		
	

	int a[]= {77,30,50,70,89,};
	int temp;
	
	
	System.out.println("ORIGNAL ARRAY");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
	
for (int i = 0; i < a.length-1; i++) {
		
	for (int j = i+1; j < a.length; j++) {
		
		//b=b-a;
//		a=a+b;
//		b=a-b;
//		
		
		a[j]=a[j]-a[i];
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];		
		
	}
	}
	
	System.out.println("\n\nREVERSE ARRAY");
	for (int i = 0; i <
			a.length; i++) {
		System.out.print(a[i]+" ");
	}
}


}
