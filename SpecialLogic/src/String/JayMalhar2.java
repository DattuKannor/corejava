package String;

//import javax.swing.text.StyledEditorKit.ForegroundAction;

public class JayMalhar2 {
	public static void main(String[] args) {
		
		int a[]= {10,4,1,6,2};
		
		int n=a.length;
		
//		System.out.println("the Product of array");
//		
//		if(n==1)
//		{
//			System.out.println(0);
//			//return;
//			
//		}
		
		
		int left[]=new int[n];
		int right[]=new int[n];
		int prod[]=new int[n];
		
		//int i,j;
		left[0]=1;
		
		right[n-1]=1;
		
		for ( int i = 1; i < n; i++) {
			left[i]=a[i-1]*left[i-1];
			
			
		}
		
		for (int i = 0; i < prod.length; i++) {
			System.out.println(left[i]+" ");
		}
		System.out.println();
		
		for (int j = n-2; j >=0; j--) 
		{
		
			right[j]=a[j+1]*right[j+1];
		}
		
		
		for ( int i = 0; i < n; i++) 
		{
		  prod[i]=left[i]*right[i];	
		}
		
//		for (int i = 0; i < n; i++) {
//			System.out.print(right[i]+" ");
//		}
		
		
		for ( int i = 0; i < n; i++) {
			
			System.out.print(prod[i]+" ");
		}
		
		
		
		}
	}


