package TimePass;

public class Pair2 {
	
//	Input: arr[] = {1, 2, 3}
//	Output: 9

	
	//public static void main(String[] args) {
		public static void main(String[] args) {
			int a[]= {1,2,3};
			int cnt=0;
			
			
			for (int i = 0; i < a.length; i++) {
				
				for (int j = i+1; j < a.length; j++) {
					if(a[j]==a[i])
					{
						a[j]=0;
						cnt++;
					}
					
					if(a[i]!=0 && a[j]!=0)
					{
						
						System.out.println("("+a[j]+","+a[i]+")");
						System.out.println("("+a[i]+","+a[j]+")");
						cnt=cnt+2;
					}
					
				}
				
				if(a[i]!=0)
				{
					System.out.println("("+a[i]+","+a[i]+")");
					cnt++;
				}
				
			
				

		}
			
			System.out.println("Possible pair :"+(cnt));
			
	}
}
