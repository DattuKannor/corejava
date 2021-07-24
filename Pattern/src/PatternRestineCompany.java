
public class PatternRestineCompany {
	public static void main(String[] args) {
//		RGBR
//		GBRG
//		BRGB
//		RGBR
		
		char ch[]= {'R','G','B'};
		int cnt=0;
		for (int i =0; i <4; i++) 
		{
			for (int j = 0; j <4; j++) 
			{
				System.out.print(ch[cnt]);
				cnt++;
				
				if(cnt==3)
				{
					cnt=0;
				}
			}
			System.out.println();
		}
	}

}
