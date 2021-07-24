package ArrayElement;

public class _30negPos {

	public static void main(String[] args) {
		int p=0,n=0,e=0,o=0;
		
		
		int []a= {-1,-2,3,7,8,9,5,-7};
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]>0)
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
					e++;
				}
				else
				{
					System.out.println(a[i]);
					o++;
				}
				p++;
			}
			else
			{
				if(a[i]%2==0)
				{
					System.out.println(a[i]);
					e++;
				}
				else
				{
					System.out.println(a[i]);
					o++;
				}
				n++;
			}
		}
		
		
		System.out.println("+ve Number :"+p);
		System.out.println("-ve Number  :"+n);
		System.out.println(" Odd        :"+o);
		System.out.println(" Even        :"+e);
	}
}
