
public class Pattern9 {
//	1
//	0 1
//	1 0 1
//	0 1 0 1
//	1 0 1 0 1
public static void main(String[] args) {
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if((i+j)%2==0)
			{
				System.out.print(i);
			}
			else{
				System.out.print(j);
			}
		}
		System.out.println();
	}
}
}
