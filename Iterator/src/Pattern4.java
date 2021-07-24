
public class Pattern4 {
//	1
//	2 1
//	3 2 1
//	4 3 2 1
//	5 4 3 2 1
	public static void main(String[] args) {
		for(int i=2;i<=6;i++)
		{
		for(int j=1;j<=i-1;j++)
		{
			System.out.print((i-j));
			
		}
		System.out.println();
		}
	}
}
