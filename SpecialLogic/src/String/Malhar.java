package String;

public class Malhar {

	public static void main(String[] args) {
		
		// __dattu_kannor__
		// output:dattu_kannor
		
		
		String a="_dattu_n_kannor_"
				;
		
		char ch[]=a.toCharArray();
		
		int cnt=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='_')
			{
				for (int j = i; j < ch.length-2; j++) 
				{
					for (int j2 = i+2; j2 < ch.length; j2++) {
						
					
					ch[j]=ch[j+1];
					
//					if(ch[i]!='_')
//					{
//						break;
//					}
//					
				}
				}
				cnt++;
				
				
			}
		}
		
		System.out.println(cnt);
		for (int i = 0; i < ch.length-cnt; i++) {
			System.out.print
			(ch[i]);
		}
		//System.out.println(cnt);
		
	}
}
