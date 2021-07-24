package TimePass;

public class Pair {
//	5. Number of unique pairs in an array. 
	//Give nan array of N elements, thet ask is to find all
	//the unique pairs that can be formed using the elements of 
	//a given array.(March Monthly).
//	Examples: Input: arr[] = {1, 1, 2}
//	Output: 4

	public static void main(String[] args) {
		int a[]= {1,1,2};
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
					//System.out.print("("+a[j]+","+a[i]+")"+",");
					//System.out.print("("+a[i]+","+a[j]+")"+",");
					cnt++;
				}
				
			}
			
			if(a[i]!=0)
			{
				//System.out.print("("+a[i]+","+a[i]+")"+",");
				cnt++;
			}
			
		
			

	}
		
		System.out.println("Possible pair :"+(cnt));
		
		
//		for (int i = 0; i < a.length; i++) {
//			
//			System.out.println(a[i]+" ");
//			
//		}
}
}
