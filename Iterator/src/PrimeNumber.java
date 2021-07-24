import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	int count =1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number");
	int n=sc.nextInt();
	
	for(int i=3;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
			
		}
	}
	
	if(count<=2)
	{
		System.out.println("PRIME NUMBER");
	}
	else
	{
		System.out.println("NOT PRIME NUMBER");
	}
	
}
}
