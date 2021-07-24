package ArrayElement;

public class EquilityArray {
public static void main(String[] args) {
	int a[]= {10,10,40,20};
	
	int b[]= {10,40,10,20};
	int t;
	int x;
	
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[j]<a[i])
			{
				t=a[j];
				a[j]=a[i];
				a[i]=t;
			}
		}
	}
	
	//
	
	System.out.println("-----Sorted Array : 1----");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	
	
	for (int i = 0; i < b.length; i++) {
		for (int j = i+1; j < b.length; j++) {
			if(b[j]<b[i])
			{
				t=b[j];
				b[j]=b[i];
				b[i]=t;
			}
		}
	}	
	System.out.println("\n\n----Sorted Array : 2---");
	for (int i = 0; i < b.length; i++) {
		System.out.print(b[i]+" ");
	}
	
	int cnt1=0;
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]==b[i])
		{
		cnt1++;
		}
   
		 
	
	}
	 if(a.length==cnt1)
	  {
		  System.out.println("\n\nArray  Equality");
	  }
	  else
	  {
		  System.out.println("\n\nArray not Equality");
	  }
	
}
}
