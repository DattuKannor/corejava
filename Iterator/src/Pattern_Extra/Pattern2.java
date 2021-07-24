package Pattern_Extra;

public class Pattern2 {
	public static void main(String[] args) {
		
		int n=1;
		for(int i=1;i<=7;i++)
		{
			for (int j = 1;j<=4; j++) 
			{
				if((i+j)==5||i==4||(i+j)==8)
				{
					System.out.print(n+" ");
					n++;
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
