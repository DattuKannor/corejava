package basic;

public class EqualityArray {
	
	public static void main(String[] args) {
		int a[]= {1,2,9,4,00};owjb 
		
		int b[]= {5,2,4,1,9};
		
		int cnt=0;
		 	
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				
				if(a[i]>a[j])
				{
				int t=a[i];
				a[i]=a[j];
				a[j]=t;
				}
				
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			for (int j = i+1; j < b.length; j++) {
				
				if(b[i]>b[j])
				{
				int t=b[i];
				b[i]=b[j];
				b[j]=t;
				}
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("\n-----");
		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i]+" ");
			
		}
		
		
				for (int i = 0; i < a.length; i++) {
					if(a[i]==b[i])
					{
					cnt++;	
					}
					
				}
			
			
	if(cnt==a.length)
			{
				System.out.println("Equlity");
			}
			else
			{
				System.out.println("Not");
			}
			
		}
	
	
	
	}


