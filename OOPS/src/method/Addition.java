package method;

public class Addition {
//	Create a class AdditionDemo having 3 instance variables number1 ,number2 and result.
//	Create 4 methods as a) addition b)subtraction c)multiplication d) division.
//	Calculate different operations as per the methods determined above. Create objects
	
	int number1,number2,c;
	void add(int a,int b)
	{
		this.number1=a;
		this.number2=b;
		c=a+b;
		System.out.println("Adition "+c);
	}
	void sub(int a,int b)
	{
		this.number1=a;
		this.number2=b;
		c=a-b;
		System.out.println("Substraction "+c);
	}
	void multi(int a,int b)
	{
		this.number1=a;
		this.number2=b;
		c=a*b;
		System.out.println("Multiplication "+c);
	}
	void div(int a,int b)
	{
		this.number1=a;
		this.number2=b;
		c=a/b;
		System.out.println("Divisin "+c);
	}

}
