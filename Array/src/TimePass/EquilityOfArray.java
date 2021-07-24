package TimePass;

public class EquilityOfArray {
	
	public static void main(String[] args) {
		int a[]= {7,2,4,8,9};
		
		int b[]= {1,4,7,8,2};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-1; j++) {
				if(a[j]>a[j+1])
				{
					int t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
					
				}
			}
		}
		
		
		
		

		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length-1; j++) {
				if(b[j]>b[j+1])
				{
					int t=b[j];
					b[j]=b[j+1];
					b[j+1]=t;
					
				}
			}
		}
		
		
		
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		
		

		int cnt=0;
		
		
		for (int i = 0; i < b.length; i++) {
			if(a[i]==b[i]);
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		if(a.length==cnt)
		{
			System.out.println("Array Is equlity");
		}
		else
			{
			System.out.println("not equility");
		}
	}	
		
	}


