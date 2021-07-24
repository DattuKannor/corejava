package OOP;

public class AdditionDemo {
	
	int num1,num2;
	
	void add(int a,int b)
	{
		System.out.println("Addtion :"+(a+b));
	}
	
	void sub(int a,int b)
	{
		System.out.println("SUBTRRACTION:"+(a-b));
	}
	
	void mul(int a,int b)
	{
		System.out.println("MULTIPLICATION:"+(a*b));
	}
	
	
	void div(int a,int b)
	{
		System.out.println("DIVISION :"+(a/b));
	}
	
	
	public static void main(String[] args) {
		AdditionDemo d=new AdditionDemo();
		
		d.add(4, 7);
		d.sub(7, 9);
		d.mul(7, 2);
		d.div(14, 2);
	}

}
