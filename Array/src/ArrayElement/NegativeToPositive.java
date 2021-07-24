package ArrayElement;

public class NegativeToPositive {
	public static void main(String[] args) 
	{
	int a[]= {-2,-4,-7,-9};
		for (int i = 0; i < a.length; i++) {
			if(a[i]<0)
			{
				int aa=(-(a[i])-(a[i]));
				System.out.println(aa/2);
				
			}
//			else
//			{
//				System.out.println(a[i]);
//			}
			
			//System.out.print(a[i]+" ");
		}
	}

}
