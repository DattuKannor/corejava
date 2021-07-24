package ArrayElement;

public class SortString {
	public static void main(String[] args) {
		String s="SAGAR";
		char temp;
		char cc='A';
		char c[]=s.toCharArray();
		
		
		for (char i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
			
		}
		
		
		
//		System.out.println("--------------------");
//		for (char i = 0; i < s.length(); i++) {
//			//System.out.println(c[i]);
//			for (int j = i; j < c.length; j++) {
//				temp=c[i];
//				 c[i]=c[j];
//				 c[j]=temp;
//				 
//			}
//			 
//			
//		}
		
		for (int i = 0; i < c.length; i++) {
			for(char j='A';i>c.length;j++)
			{
				
					temp=c[i];
					 c[i]=c[j];
					 c[j]=temp;
				
				
				
			}
		}
		
		
	}

}
