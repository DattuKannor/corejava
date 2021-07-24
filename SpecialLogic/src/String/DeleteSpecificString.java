package String;

public class DeleteSpecificString {
	
	public static void main(String[] args) {
		
		String s="sagar";
		
		char c[]=s.toCharArray();
		char delete='g';
		int cnt=0;
		for (int i = 0; i < c.length; i++) {
			
		if(c[i]==delete)
		{
			for (int j = i; j < c.length-1; j++) {
				c[j]=c[j+1];
				
			}
			cnt++;
			break;
			
		}
			
		}
		
		if(cnt!=0)
		{
		for (int i = 0; i < c.length-1; i++) {
			System.out.print(c[i]);
		}
		}
		
	}

}
