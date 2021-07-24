package ArrayElement;

public class AsParameterArray {
	
	void m1(int a[])
	{
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	public static void main(String[] args) {
		int []a= {2,3,4,6,7};
		
		AsParameterArray as=new AsParameterArray();
		as.m1(a);
	}

}
