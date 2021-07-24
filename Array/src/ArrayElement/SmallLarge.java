package ArrayElement;

public class SmallLarge {
	public static void main(String[] args) {
		int a[]= {34,56,1,57,100,89};
		int min=a[1];
		System.out.println("a[0] :"+min);
		int t;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("Small sconfd :"+min);
		
		
		System.out.println("---------------");
		int b[]= {34,56,1,57,89};
		int max=a[0];
		System.out.println("a[0] :"+max);
		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Largest :"+max);
		
		
	}

}
