8package ArrayElement;

public class CharatArray {
	
	public static void main(String[] args) {
		
	
	
	char[] s1= {'a','b','c','d'};
	char s2[]= {'w','x','y','z'};
	
	int s=(s1.length)+(s2.length);
	  char s3[]= new char[s];
	
for (int i = 0; i < s1.length; i++) {
		System.out.print(s1[i]+" ");
	}
	
	
	System.out.println();
	for (int i = 0; i < s2.length; i++) {
		System.out.print(s2[i]+" ");
	}
	
	System.out.println("\n----------");
	
	
	int cnt1=0,cnt2=0;
	for (int i = 0; i <s3.length; i++) {
		
		
		if(i%2==0)
		{
			s3[i]=s1[cnt1];
			cnt1++;
		}
		else if(i%2==1)
		{
			s3[i]=s2[cnt2];
			cnt2++;
			
		}
		
	}
	
	
	for (int i = 0; i < s3.length; i++) {
		System.out.print(s3[i]+" ");
	}
	}
}
