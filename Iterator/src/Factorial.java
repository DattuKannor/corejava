import java.util.Scanner;

public class Factorial {
//Calculate factorial of a number.
	public static void main(String[] args) {
		int f=1;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=sc.nextInt();
		System.out.println("Factorial of Given Number is");
		while(n>=1)
		{
			//System.out.println(" "+n);
			System.out.print("  "+n +" *");
			f=f*n;
			n--;
			
			
			
		}
		System.out.println("\n Answer= "+f);
		
	}
}
