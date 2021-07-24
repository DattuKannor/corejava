package method;

import java.util.Scanner;

public class AdditionDemo {

	public static void main(String[] args) {
		Addition a=new Addition();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENter First Number");
		int x=sc.nextInt();
		System.out.println("ENter Second Number");
		int y=sc.nextInt();
		
		
		
		a.add(x, y);
		a.sub(x,y);
		a.multi(x, y);
		a.div(x, y);
		

	}

}
