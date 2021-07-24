package ArrayElement;

public class ReverseArrayWithTemp {
	public static void main(String[] args) {
		
		int a[]= {10,20,39,40,60};
		int t;
		
		System.out.println("----Orignal Array----");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		} 
		for (int i = 0; i < a.length-1; i++) {
			
			
			t=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=t;
		}
		
		System.out.println("\n----Reverse Array----");
	for (int i = 0; i < a.length; i++) {
		
		System.out.print(a[i]+" ");
	}
		
	}

}
