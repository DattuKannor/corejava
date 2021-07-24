package Contructor;

public class Circle {

	float pi=3.14f;

	float cirleArea(float r)
	{
		float area=r*r*pi;
		return area;
	}
	
	float circufirance(float r)
	{
		float area=2*pi*r;
		return area;
		
	}
	
	public static void main(String[] args) {
		Circle c=new Circle();
		System.out.println("Area of Circle: "+c.cirleArea(4));
		System.out.println("Cicuference of circle :"+c.circufirance(4));
		
	}
	
}
