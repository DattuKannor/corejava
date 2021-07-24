

public class Pattern13 {
public static void main(String[] args) {
//	*
//	***
//	*****
//	*******
//	*********
//	*******
//	*****
//	***
//	*
System.out.println("*");
	for(int i=1;i<=5;i++)
	{
		
	for(int j=1;j<=i;j++)
	{
		
	if((j+2)%2==1)
	{
		System.out.print("**");
	}
	else if((j+2)%2==0)
	{
		System.out.print("**");
	}
	
	}
	System.out.println();
	}
	
	for(int i=1;i<=5;i++)
	{
		for(int j=5;j>=i;j--)
		{
			System.out.print("**");
		}
		System.out.println();
	}
	System.out.println("*");
}
}

