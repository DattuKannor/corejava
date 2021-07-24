package String;

public class StringSmallLarge {
	
	public static void main(String[] args) {
		
		
		String s1="bbaaaaaaabbaccccccccccccccb";
		
		char c[]=s1.toCharArray();
		
		char min=c[1];
		char max=c[1];
		for (int i = 0; i < c.length; i++) {
			
			if(min<c[i])
			{
				min=c[i];
			}
			if(max>c[i])
			{
				max=c[i];
			}
			
			
		}
		
		System.out.println(min);
		System.out.println(max);
	}

}
