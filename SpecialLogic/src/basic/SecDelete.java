package basic;

public class SecDelete {
	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7,8};
		
		int delete=5;
		int cnt=0;
		
		for (int i = 0; i < a.length-1; i++) {
			if(a[i]==delete)
			{
				int t=a[i];
				a[i]=a[i+1];
				a[i+1]=t;
			}
		}
		
		for (int i = 0; i < a.length-1; i++) {
			System.out.print(a[i]+" ");
		}
	}

}
