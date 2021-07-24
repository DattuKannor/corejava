package String;

//import javax.swing.text.StyledEditorKit.ForegroundAction;

public class StringSecondLarge 
{
	
	public static void main(String[] args) {
		
		char max1=0,max2=0;
		String s="aabbbcccc";
		
		char c[]=s.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			
			if(max1<c[i])
			{
				max2=max1;
				max1=c[i];
			}
			 if((c[i]!=max1) && (c[i]>max2))
			{
				max2=c[i];
			}
			
			
		}
		
		System.out.println(max2+" second");
	}
	

}
