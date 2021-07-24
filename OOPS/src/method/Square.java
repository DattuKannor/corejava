package method;

public class Square {
	
	double calculateArea(double s)
	{
	double area =s*s;
	return area;
	
		
	}
	
	
	public static void main(String[] args) {
		Square s=new Square();
		System.out.println(s.calculateArea(20));
	}

}
