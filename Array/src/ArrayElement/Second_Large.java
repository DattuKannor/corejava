package ArrayElement;

public class Second_Large {
	public static void main(String[] args) {
		System.out.println("---------------");
		int max1,max2=0;
		int a[]= {2,5,1,4};
		 max1=a[1];
		//System.out.println("a[0] :"+max1);
		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max1)
			{
			    max2=max1;
			    max1=a[i];
				
			}
			else if(a[i]!=max1 && a[i]>max2)
			{
			  max2=a[i];	
			}
		}
		System.out.println("Second Largest :"+max2);
		System.out.println("First Largest :"+max1);
		

	}

}
