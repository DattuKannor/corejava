package basic;

public class ArrayPair {
public static void main(String[] args) {
	
	
	int a[]= {1,3,2};
	
	
	
	for (int i = 0; i < a.length; i++) {
		int cnt=0;
		for (int j = i+1; j < a.length; j++) {
			
			if(a[j]==a[i])
			{
				a[j]=0;
				cnt++;
			}
			
			if(a[i]!=0 && a[j]!=0)
			{
				System.out.println("("+a[i]+","+a[j]+")");
				System.out.println("("+a[j]+","+a[i]+")");
			}
			
		}
		
		if(a[i]!=0)
		{
			System.out.println("("+a[i]+","+a[i]+")");
		}
	}
	
	


}
}
