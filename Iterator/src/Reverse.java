import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any Number");
	int n=sc.nextInt();
	
	int temp=n;
	int rev=0;
	
	while(n>0)
	{
		int rem=n%10;
		rev=10*rev+rem;
		n=n/10;
	}
	
	System.out.println("REVERSE NUMBER"+ " :"+rev);
	
	if(temp==rev)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Not Palindrom");
	}
	
}
}
