package basic;

public class SecondLarge {
	
	public static void main(String[] args) {
		
		int a[]= {1,3,4,5,6};
		
		
		int min=a[1];
		int max2=0;
		for (int i = 0; i < a.length; i++) {
			if(min>a[i])
			{
				max2=min;
				min=a[i];
				
			}
//			else if(a[i]!=min && a[i]>max2)
//			{
//				max2=a[i];
//			}
		}
		System.out.println(min);
		System.out.println(max2);
		
	}

}
