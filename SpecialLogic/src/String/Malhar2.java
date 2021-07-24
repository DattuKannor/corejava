package String;



public class Malhar2
{

	public static void main(String[] args) {
		
		// __dattu_kannor__
		// output:dattu_kannor
		
		
		String a="__dattu_n_kannor_"
				;
		
		char ch[]=a.toCharArray();
		
		int cnt=0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]=='_')
			{
				for (int j = i+1; j < ch.length-1; j++) 
				{
					for (int j2 = j+1; j2 < ch.length-1; j2++) {
						
					
					ch[j]=ch[j+1];
					
//					
//					
				}
					
					
				}//for j2
				
				
			}//j
			
			if(ch[i]!='_')
			{
				break;
			}
			
			cnt++;
		}//i
		
		System.out.println(cnt);
		for (int i = 0; i < ch.length-2; i++) {
			System.out.print
			(ch[i]);
		}
		//System.out.println(cnt);
		
	}
}

