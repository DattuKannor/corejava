package basic;

public class FistMin {
	public static void main(String[] args) {
		
		int a[]= {55,4,5,8,1
				,89,55,99};
		
		int min=a[0];
		
		int max=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if(min>a[i])
			{
				min=a[i];
			}
			
			if(max<a[i])
			{
				max=a[i];
			}
			
		}
		
		
		System.out.println(min);
		System.out.println(max);
		
	}

}
