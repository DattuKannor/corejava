package method;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		int n;
		do
		{
		System.out.println("1Addition ");
		System.out.println("2Subtraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Division ");
		System.out.println("5.Exit ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Choice");
		int ch = sc.nextInt();

		System.out.println("Enter Two Number");
		int a=sc.nextInt();
		int b=sc.nextInt();

		switch (ch) {
		case 1:
   System.out.println("Addition "+c.addition(a, b));
			
			break;

		case 2:
			 System.out.println("Subtraction "+c.subtraction(a, b));

			break;
		case 3:
			 System.out.println("Multiplication "+c.multiplication(a, b));
					break;
					
		case 4:
			 System.out.println("Division "+c.division(a, b));
					break;
		case 5:
			 System.exit(0);

	}
	 System.out.println("do u want to contineous.....(1/0)");
	 n=sc.nextInt();
		}while(n==1);
}
}