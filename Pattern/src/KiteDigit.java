
public class KiteDigit {
	public static void main(String[] args) {
		int n=1;
		for (int i = 0; i <=7; i++) 
		{
			for (int j = 0; j <=6; j++) {
				
				if((i+j)==3 || (j-i)==3 ||(i-j)==3 ||(i-j)==3 ||(i+j)==9 )
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
