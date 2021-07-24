package Contructor;

public class Rectangle {
	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		Rectangle r2=new Rectangle(10,20);
		Rectangle r3=new Rectangle(20);
		
		
	}
	
	double length ,breadth ;
	Rectangle()
	{
		
	}
	
	Rectangle(double length , double breadth)
	{
		System.out.println("Araea of rectangle :"+length*breadth);
		
	}
	
	Rectangle(double le_bre)
	{
		System.out.println("Araea of rectangle :	"+(le_bre*le_bre));
	}
	
	

}
