import java.util.Scanner;

public class EvenOdd {
	//Display all even and odd numbers from 1 to100.
	
	public static void main(String[] args) {
		
		int i=1;
		while(i<=100)
		{
			if(i%2==1)
			{
				System.out.print("|Odd :"+i+"|\t");
				i++;
			}
			else
			{
				System.out.print(" |Even  :"+i+"|\n");
				i++;
			}
		}
		
	}

}
