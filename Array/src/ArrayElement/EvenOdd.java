package ArrayElement;

public class EvenOdd {
	
	public static void main(String[] args) {
		
		int a[]= {12,11,32,33,56,60};
		
		int e[]=new int[6];
		int o[]=new int[6];
		int cnt1=0,cnt2=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
			{
				e[cnt1]=a[i];
				cnt1++;
			}
			else
			{
				o[cnt2]=a[i];
				cnt2++;
			}
		}	
		
		System.out.println("------------------------");
		System.out.print("EVEN :");
		for (int i = 0; i < cnt1; i++) {
			System.out.print(e[i]+" ");
		}
		
		
		System.out.println("------------------------");
		System.out.print("ODD :");
		for (int i = 0; i < cnt2; i++) {
			System.out.print(o[i]+" ");
		}
		
		
	}

}
