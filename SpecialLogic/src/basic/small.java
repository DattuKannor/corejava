package basic;

public class small {
public static void main(String[] args) {
		
		int a[]= {1,5,10,15,20};
		
		
		int max1=a[1];
		int max2=0;
		for (int i = 0; i < a.length; i++) {
			if(max1<a[i])
			{
				max2=max1;
				max1=a[i];
				
			}
			else if(a[i]!=max1 && a[i]>max2)
			{
				max2=a[i];
			}
		}
		//System.out.println(min);
		System.out.println(max2);
		
	}


}
