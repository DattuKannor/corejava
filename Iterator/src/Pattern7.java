
public class Pattern7 {
public static void main(String[] args) {
//	Write a java program to print the following pattern:.
//	1
//	2 2
//	3 3 3
//	4 4 4 4
//	5 5555
	
	
	for(int i=0;i<=4;i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print((i+1)+" ");
		}
		System.out.println();
	}
}
}
