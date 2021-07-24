package method;

public class OverLaod {

	void test()
	{
	
		System.out.println("Not Paramerised Method");
	}
	
	void test(int a)
	{
		System.out.println("Method with Single Intger Parameter");
		
	}
	
	void test(String s)
	{
		System.out.println("Method with Single String Parameter");
	}
	
	void test(float a,double b)
	{
		System.out.println("Method with two Parameter float and double");
	}
	
	public static void main(String[] args) {
		OverLaod o=new OverLaod();
		o.test();
		
		System.out.println();
		o.test(10);
		System.out.println();
		o.test("Sagar");
		System.out.println();
		o.test(9.0f, 90.0);
	}

}
