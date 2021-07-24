package method;

public class Area {

	void area(int side) {
		
		System.out.println("Area of Square: "+(side*side));
		
	}
	
void area(int l,int b,int h) {
	
	System.out.println("Area of Reactangle :"+(l*b*h));
		
	}
void area(int r,double pi) {
	System.out.println("Area of circle :"+(pi*r*r));
	
}
	public static void main(String[] args) {
		Area a=new Area();
		a.area(5);
		a.area(2,3.14);
		a.area(2, 3, 4);
	}
	
	
}
