package method;

import java.util.Scanner;

public class Tringle {
	
	Scanner sc=new Scanner(System.in);
	double angle1,angle2,angle3;
	double h,b;
	double side1 , side2 ,side3;
	
void isosceles()
{

	
	System.out.println("Enter side1,side2,side3");
	side1=sc.nextDouble();
	side2=sc.nextDouble();
	side3=sc.nextDouble();
  
	if(side1==side2 || side1==side3 || side3==side2)
	{
		System.out.println("triangle is isosceles");
   }
	else
	{
		System.out.println("triangle is not isosceles");
	}
	
}

void equilateral()
{
	//double side1 , side2 ,side3;
	
	System.out.println("Enter side1,side2,side3");
	side1=sc.nextDouble();
	side2=sc.nextDouble();
	side3=sc.nextDouble();
  
	if(side1==side2 && side2==side3 && side1==side3)
	{
		System.out.println("Tring is Equilateral ");
	}
	else
	{
		System.out.println("Trinagle not Equilateral");
	}
}

 void tringlePerimeter()
 {
	 //double side1 , side2 ,side3;
		
		System.out.println("Enter side1,side2,side3");
		side1=sc.nextDouble();
		side2=sc.nextDouble();
		side3=sc.nextDouble();
	double area=side1+side2+side3;
	System.out.println("Tringle Perimeter: "+area);
 }
 
 void tringleArea()
 {
	 System.out.println("Enter three side :");
	 side1=sc.nextDouble();
	 side2=sc.nextDouble();
	 side3=sc.nextDouble();
	 
	double s=(side1+side2+side3)/3;
	
	double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	 
	 
	 System.out.println("Triangle Area :"+area);
 }
 void rightAngled() 
 {
	System.out.println("Enter Three angle "); 
	angle1=sc.nextDouble();
	angle2=sc.nextDouble();
	angle3=sc.nextDouble();
	
	double right=angle1+angle2+angle3;
	
	if((angle1==90 || angle2==90 ||angle3==90)&& (right==180))
	{
		
		System.out.println("Right angle triangle ");
	}
	else
	{
		System.out.println("Not Right Angle");
	}
 }
 
 public static void main(String[] args) {
	
	 
	 Tringle t=new Tringle();
	 
	 System.out.println("-----Tringle Perimeter------");
	t.tringlePerimeter();
	System.out.println("------------------------------");
	 System.out.println("-----Check Tringle is IsoSceles or not------");
	t.isosceles();
	
	System.out.println("----------------------------");
	 System.out.println("-----Check Tringle is Equilateral or not");
	t.equilateral();
	
	System.out.println("-----------------------------------");
	 System.out.println("-----Area of Trinagle------");
	t.tringleArea();
	
}
 
}

