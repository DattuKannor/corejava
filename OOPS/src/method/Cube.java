package method;

import java.util.Scanner;

public class Cube {
	double h,w,d;
	Scanner sc=new Scanner(System.in);
	
	
	void calculate()
	{
		System.out.println("Enter Hieght,Width,Depth");
		h=sc.nextDouble();
		w=sc.nextDouble();
		d=sc.nextDouble();
		
		double volume=h*w*d;
		
		System.out.println("VOULME OF CUBE "+volume);
	}
	public static void main(String[] args) {
		Cube c=new Cube();
		c.calculate();
	}

}
