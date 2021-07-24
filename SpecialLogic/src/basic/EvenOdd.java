package basic;

public class EvenOdd {
	
	public static void main(String[] args) {
		int a[]= { 1,2,3,4,5,6,7,8};
		
		int e[]=new int[6];
		int o[]=new int[6];
		
		int e_cnt=0;
		int o_cnt=0;
		
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0)
			{
				e[e_cnt]=a[i];
				
				e_cnt++;
				
			}
			else
			{
				o[o_cnt]=a[i];
				o_cnt++;
			}
		}
		
		for (int i = 0; i < o_cnt; i++) {
			System.out.print(o[i]+" ");
		}
		System.out.println("\n-------");
		for (int i = 0; i < e_cnt; i++) {
			System.out.print(e[i]+" ");
		}
		
	}

}
