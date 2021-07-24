package basic;

public class CompareWithIgnoreCase {
	
	public static void main(String[] args) {
		
		
		String s1="sagar";
		String s2="SAGA";
		
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		
		int cnt=0;
		if(c1.length==c2.length)
		{
			
			for (int i = 0; i < c2.length; i++) {
				if(c1[i]==c2[i] ||c1[i]==c2[i]+32  || c1[i]+32==c2[i] || c1[i]==c2[i]-32 ||c1[i]-32==c2[i])
				{
					cnt++;
				}
				else
				{
					System.out.println("No");
					break;
				}
					
			}
			
		  if(cnt==c1.length)
		  {
			  System.out.println("yes");
		  }
		}
		else
		{
			System.out.println("no");
		}
	}

}
