package Contructor;

public class Test {

	
	
	void evenOdd(int n)
	{
		if(n%2==0) {
			System.out.println("EVEN NUMBER");
		}
		else
		{
			System.out.println("ODD");
		}
	}
	
	void factorial(int n)
	{
		int f=1;
		while(n>0)
		{
			
			f=f*n;
			n--;
		}
		System.out.println("FACTORIAL :"+f);
	}
	
	void sumOfDihit(int n)
	{
		int sum=0,rem;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
			
		}
		System.out.println("SUM OF DIGIT :"+sum);
	}
	public static void main(String[] args) {
		Test t=new Test();
		t.evenOdd(4);
		t.factorial(4);
		t.sumOfDihit(12345);
	
	}
}
