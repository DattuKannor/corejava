package basic;

public class SeocndLargeString {

	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("abcaacda");
		
		String s1=new String(s);
		
		char c[]=s1.toCharArray();
		
		int tem[]=new int[c.length];
		
		for (int i = 0; i < c.length; i++) {
			
			int cnt=1;
			for (int j =i+1; j < c.length; j++) {
				
				
				if(c[i]==c[j])
				{
					c[j]='0';
					tem[i]=c[i];
					cnt++;
				}
				
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
		
		
		
	}
}