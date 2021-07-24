package basic;

public class Demo {
	public static void main(String[] args) {
		
		String s1="abcd";
		
		String s2="abcdfvdhk";
	
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		int cnt=0;
		
		for (int i = 0; i < c1.length; i++) {
			
			if(c1[i]==c2[i])
			{
				cnt++;
				
				if(cnt==c1.length)
				{
					//System.out.println("no");
					break;
				}
			}
			
		}
		
		if(cnt==c1.length)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}
}
