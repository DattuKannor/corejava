package Contructor;

public class Rectangle1 {
	double lenght,width,area;
	
	Rectangle1()
	{
		lenght=12;
		width=34;
		
		
		
		
	}
	
	
	void reactangleArea()
	{
		area=lenght*width;
		System.out.println("Rectangle Area :"+area);
	}
	
	void reactanglePerimeter()
	{
		area=2*(lenght+width);
		System.out.println("Reactangle Perimeter :"+area);
	}
	
	
	public static void main(String[] args) {
		Rectangle1 r=new Rectangle1();
		Rectangle1 r1=new Rectangle1();
		r.reactangleArea();
		r.reactanglePerimeter();
		System.out.println("-----------------------");
		
		r1.reactangleArea();
		r1.reactanglePerimeter();
   
		
	}

}
